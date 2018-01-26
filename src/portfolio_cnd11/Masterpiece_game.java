package portfolio_cnd11;

	/*
	 * This is the start of the masterpiece. I chose a for-each loop from my step method from 
	 * BreakoutGame.java that I feel uses a sequence of well-organized code. I refactored to stop
	 * data dependencies in methods and added helper methods to make smoother code. 
	 * 
	 * The for loop: parses through all bricks and and checks if a ball intersects and the if 
	 * statement now directly uses the helper method instead of creating a boolean in between.
	 * The bounce(Brick b) method is now a void (as it should have been), and only passes the brick
	 * b as its parameter. Collide is a helper method that is used for when a brick is hit.
	 * The second for loop goes through all lasers and once again compares them to bricks, 
	 * checking for intersects, while now also moving the laser if it hasn't hit a block,
	 * an action done in a separate for loop previously.
	 */
	for (Brick b: bricks) {
		if (intersect(ball, b)) {
			ball.bounce(b);
			brickHits++;
			collide();
		}
		for (int i = 0; i < lasers.size(); i++) {
			Laser l = lasers.get(i);
			if (intersect(l, b)) {
				l.remove();
			}
			l.setY(l.getY() + 
					BALL_SPEED*elapsedTime*l.getDir());
		}	
	}
	
	/*
	 * The laser class is the example class I am using for the masterpiece. It is simple:
	 * it is constructed at a location passed to it, then moves in a given direction.
	 * Simple and easy to interact with. 
	 */
	public class Laser extends Rectangle {
		private double direction;
		
		public Laser (double x, double y, double Width, double Height) {
			super(x, y, Width, Height);
			this.setFill(Color.RED);
			if (y > 50) direction = -1.25; //if the laser is create below the top paddle, it
										  //was shot by the bottom paddle and should move up
			else direction = 1.25;
		}
		
		public double getDir() {
			return direction; //returns whether the laser is being shot up or down
		}
		public void remove() {
			this.setX(-100); //sends laser off-screen
		}
	}
	
	/*
	 * Returns true if two shapes intersect
	 */
	private boolean intersect(Shape s1, Shape s2) {
		return Shape.intersect(s1, s2).getBoundsInLocal().getWidth() != -1;
	}
	
	/*
	 * The actions to be done when an object collides with a brick. First checks if there 
	 * is a power in the brick, then changes the state, breaking a block if the state 
	 * is no longer valid. Then checks if the block collided with was the last block.
	 */
	private void collide() {
		checkPowers(b);
		if (b.changeState(-1, ball)) {
			breakBlock();
		}
		if (blockCount==0) nextLevel();
	}
	
	/*
	 * How the program check if a power is in a brick. Given that a power was created inside
	 * a brick, you just have to see if the brick hit was the one it was created inside. 
	 * If so, turn on the power-up
	 */
	private void checkPowers(Brick b) {
		for (PowerUp p: powers) {
			if (b.getX() + BLOCK_WIDTH/2 == p.getCenterX() 
					&& b.getY() + BLOCK_HEIGHT/2 == p.getCenterY()) 
				p.turnOn(ball, SIZE);
		}
	}
	
	/*
	 * Same bounce method from class ball but now with less data dependencies. Uses just the brick 
	 * passed to get width and hight values. Was reverted back to a void method, as now
	 * brickHits is updated in the original for loop. 
	 */
	public void bounce (Brick b) {
		hitCount--;
		int height = b.getHeight();
		int width = b.getWidth();
		if (this.getCenterY() >= b.getY() && 
				this.getCenterY() <= b.getY() + height) {
			this.setCenterX(this.getCenterX() - 3*XSpeed);
			XSpeed = -XSpeed;
		}
		else if (this.getCenterX() >= b.getX() && 
				this.getCenterX() <= b.getX() + width) {
			this.setCenterY(this.getCenterY() - 3*YSpeed);
			YSpeed = -YSpeed;
		}
		else {			
			double bcenterX = b.getX() + width/2;
			double bcenterY = b.getY() + height/2;
			double distance = this.getRadius();
			if (this.getCenterX() > bcenterX) {
				if (this.getCenterY() > bcenterY) {
					bcenterX = bcenterX + width/2;
					bcenterY = bcenterY + height/2;
				}
				else {
					bcenterX = bcenterX + width/2;
					bcenterY = bcenterY - height/2;
				}
			}
			else {
				if (this.getCenterY() > bcenterY) {
					bcenterX = bcenterX - width/2;
					bcenterY = bcenterY + height/2;
				}
				else {
					bcenterX = bcenterX - width/2;
					bcenterY = bcenterY - height/2;
				}
			}
			XSpeed = (14/distance)*((this.getCenterX() - bcenterX)/distance);
			YSpeed = (14/distance)*((this.getCenterY() - bcenterY)/distance); 
			//above line was this.getCenterX() - bcenterX, was why the ball moved
			//so slowly when hitting the corner a certain way.
			this.setCenterX(this.getCenterX() + 3*XSpeed);
			this.setCenterY(this.getCenterY() + 3*YSpeed);
		}
	}