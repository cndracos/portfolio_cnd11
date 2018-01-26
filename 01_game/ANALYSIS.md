CompSci 308: Game Analysis
===================

Project Journal
=======

### Time Review

	*Reflect on how you spent your time while working on this project.
	
	**Report how many hours you spent on the project as well as its start and finish dates (do not forget to include time spent planning and reading).
	**Describe how you spent your time (i.e., coding new features, refactoring, testing, reading, designing, debugging, documenting, or meeting with team members).
	**Describe how you personally managed your code (i.e., how often did you develop, test, commit, or push pieces)?
	**Reflect on what what tasks were easiest for you to do and what were hardest; what were good uses of your time and what were bad.
	
	From start to finish this project took me about 18 hours, starting on Tuesday the 16th and ending on Monday the 22. I did not, however, start coding until Thursday the 18th, as up until that point I was mainly planning on how to implement the aspects of the game as well as reading on how the JavaFX program runs. I spent most my time coding new features, debugging, designing, and refactoring. It took time to code new features due to the fact that most features I would add needed to be able to work with all existing features, finding where objects interact and dealing with what happens when they do. I had a couple of bugs that were with me at the beginning and stuck with me until the end, but that doesn't mean I spent a good amount of time working on how to best fix them (with a good amount of hours figuring out how to deal with then the ball hits two corners at the same time from the side). Designing was also a pretty big aspect for me, as I wanted the game to look nice and run smoothly, choosing how to best give the ball movement and how to place blocks on the screen by using a text file. After most of these activities were done for a certain section, I would go back to look to see if there was anywhere with duplicate code that I could refactor, truth statements to be optimized, and class methods to be better implemented. I met with a friend as well to discuss some game mechanics, as well as visited the JavaFX API to learn how to make certain events happen, and documented my code towards the end. 
	I realized during coding on Thursday that I had started a bit behind, resulting in a rather long coding session that created the basics of the game upon which I built--blocks, the paddle, moving the ball around. From then on I would try to work on the code whenever I had the free time to do so, and after every session regardless how short (or long) I would commit and push the changes. After any major addition or design change, I would test the new code by running the game and using a 'cheat' I added which was moving the ball to the position of a mouse click, allowing me to see how the ball reacted to corners, power-up block, and other speed/design changes during that coding session. The easiest tasks for me to do were getting the blocks onto the screen and adding the power-ups inside them, as well as creating the laser class. The hardest task for me was dealing with corner cases with the ball bouncing off a block and detecting when to get a power-up to drop. I spent too much time worrying about the ball corner case, moving back and forth between ideas, trying to create a too advanced method of bouncing off the bricks. Another poor use of my time was adding the labels to the loading screen, which while only taking about 30 minutes (and looking nice), should have been spent either refactoring or debugging, 

### Commits

	*Reflect on how often you committed code as well as the size and purpose of your commits.

	**Report how many times you committed code and the average size of those commits.
	**Look back over your commit messages, do you feel they accurately represent your project's "story"?
	**Describe two of your commits (identified by their message) in detail:
	***What was the purpose of your commit (i.e., new feature, refactoring, debugging, etc.)?
	***Why did you choose to package these changes as a commit?
	***Is this commit's size reasonable for someone else to review before allowing it into the repository?
	
	Over the span of six days, I committed code directly from Breakout 11 times with an average (net) commit size of 72 lines, and average commit size (including deleted lines) of 162 lines. It should be noted, however, one commit was turning my classes from private and in BreakoutGame.java into public classes by themselves. This counted for one commit of 305 added lines and 261 lines deleted, with the extra lines being more variables to be passed and handled. Six commits were the level text files, and eight commits were for the README file, with that number being relatively high due to the fact that I kept finding aspects to be added to the README. Looking back over my commit messages, I feel they do accurately represent this project's story, which was writing large amount of code in pieces then going back in to refine them. You can even see some frustration in the commit messages, which I plan on being more professional about and leaving out in the future. There are messages that could be more specific, such as replacing 'refactored a bit' with 'created method to return true if shapes intersect'. Should not have jokes in the messages. 
	First commit that I will go into detail: [Added the ability to get power-ups and advance a level](https://coursework.cs.duke.edu/CompSci308_2018Spring/game_cnd11/commit/f15a91cb792e63a1e760e0c29667a6c64f6cd14a)
	This commit added new features, such as getting a power-up from the text file and putting it inside a block, and how the power-up would be handled by the paddle when absorbed. This was when I decided how to read in a text file for a new level and how to handle getting the level to happen. I added the power-up ArrayList to the step method, allowed the paddles to move independently of each other based on the ball's Y location, added methods to paddle and created the power-up class. This commit combined adding a new feature (power-ups), refactoring my file-reading method, and eventually debugging to best handle how to 'activate a power-up inside a block. This was a medium size commit that dealt with a lot of different factors of the middle part of coding the game, and was a good step in several categories of coming to a completed game. Its size is reasonable, being just 183 additions and 46 deletions. 
	Second commit: [Separated classes into actual classes. Power-up not on screen for who knows why](https://coursework.cs.duke.edu/CompSci308_2018Spring/game_cnd11/commit/18426a4075b47678f2b12d4d916773e88ae70be3)
	This commit is the most unique one (maybe besides the first one) that I did. It was a large-scale refactoring of sorts as well as a design change, to be followed by a bit of debugging before finally being committed. Every class I had in BreakoutGame.java was moved into its own separate class, no longer able to access the global variable from the main game runner, creating new problems to be tackled. I had a couple of methods that would be in class Paddle but would modify Ball, and the lack of access to the paddle, other, and ball instance variable caused for these objects to have to be passed as parameters into many functions of the classes, such as changeDirection, where a Paddle has to be known to change the ball's parameters, and bounce, where the ball moves direction and the block has to change value if it is breakable. Another variable that had to be passed often was the SIZE variable, as much positioning had to do with this value. I changed some void functions to either boolean or ints, allowing a ball to hit a brick and change its value at the same time. This was a large commit, but mainly had duplicate code being added and deleted. Its final size was 305 added lines and 261 deletions. 

### Conclusions

	*Reflect on how effectively you worked on the project.

	**Did you over- or underestimate the size of this project? How can you estimate better in the future?
	**Which parts of your code required the most editing? why?
	**To be a better designer, what should you start doing, keep doing, or stop doing?
	**If you could work on one part right now to improve any aspect of your project, what would it be?
	
	I would say that I barely underestimated the size of this project. I knew that it would be time consuming but didn't really realize what that meant until I sat down that Thursday and spent a good amount of hours to get to a point to where I feel I would be able to (relatively) comfortably finish the project on time. In the future I can read up on the details of the projects and try to make a plan on how I would go about coding it--how many classes, methods, cases, etc., then compare that to this project in order to gauge about how rigorous the project will be and proceed to better allocate my time to specific problems. The parts of my code that required the most editing were the bounce class in Ball and the for-loop that I use in the step method. The reason I spent a lot of time editing bounce was to try to deal with the different cases to best smooth the project. The for loop then required the most editing/refactoring as I was trying limit the amount of times I had to parse through my ArrayLists and how to efficiently compare values then do an action based on the multiple cases that could occur. Another part of code that required editing was the paddle class, as for whenever I added a new aspect to the game (lasers, paddle length increase), I would have to add a new variable or method to reflect new actions in the game. 
	In order to be a better designer, I should start looking at my classes and thinking about how to efficiently divide them into subclasses based on the variety of objects in the class themselves. This would eliminate the 'state' integer that you will find in many of my classes, which is used to keep track of, as one would expect, the state of that object, whether a power-up (of the paddle or ball), or what kind of brick (in the block class). Another part I should start is leaving methods to act upon just the class it is in. Something that I believe that I should keep doing is making boolean methods which simplify 'if' expressions and logic statements, as well as creating methods for long lines of bulky code that make the code easier to read and code. I should work to stop killing myself over specific algorithms that make the program marginally better and instead give functional, simpler code that works and I can come back to later. 
	If I could work on one part right now to improve upon my project, it would be to create better interactivity between my classes, and not the handful of hybrid methods I currently have that use variable from multiple classes and places, relying upon passing parameters as supposed to quick clean code that is a couple of lines and accomplishes the same thing upon these multiple objects.


Design Review
=======

### Status

	*Reflect on the coding details of the project by reviewing the code.
	
	**Is the code generally consistent in its layout, naming conventions and descriptiveness, and style?
	**Is the code generally readable (i.e., does it do what you expect, does it require comments to understand)?
	**Are the dependencies in the code clear and easy to find or do they exist through "back channels" (e.g., global variables, order of method call, or get methods instead of parameters)?
	**Describe two pieces of code in detail:
	***Describe the purpose of this code in the overall project.
	***What makes this code easy (or hard) to read and understand?
	
	I would say that the code is generally consistent in its layout, naming conventions and descriptiveness, and style. Its layout is consistent in how I deal with one-line if statement on the same line, how I parse through ArrayLists with a for-each loop(most of the time), and how I went about creating my classes by having constructors, getters, and setters above mutator methods. The naming of variable is good but could have been better; I could have add 'my' to the local instance variable in my classes. Other is a bit ambiguous naming for the top paddle, but made for easier coding than paddle1 and paddle2. The code is generally readable, although I will admit my commenting made reading the code worse, not better, as it was my first time commenting and I messed up with what what expected by comment everything. Most methods are descriptive and do what they say, with some methods in my classes doing an extra thing or two to make up for a lack of interactivity between the main method and private classes. The bounce method seems to me the main one to explain what it is doing, with maybe how power-ups are activated. The dependencies can be tough to find, as many global variables are used in the BreakoutGame class to keep variable throughout the code from when I first had all my private classes in this class. There are then many parameters being passed to the new separate methods, returns ints or booleans on convenience as supposed to functionality. 
	First piece of code to be described:
	
'''java
	/**
	 * Reads in a double value and creates two unique objects (if !=0)
	 */
	 x = s.nextDouble();
			y = (x - Math.floor(x));
			x = x-y;
			y = Math.floor((y+.01)*10);
			if (x!=0) {
				blocks.add(new Brick(x, BLOCK_WIDTH, BLOCK_HEIGHT, 
					XValue, YValue));
				blockCount++;
			}
			if (y!=0) {
				powers.add(new PowerUp(y, BLOCK_WIDTH/2 + XValue,
						BLOCK_HEIGHT/2 + YValue, 4));
			}
'''

	This piece of code is how I read the blocks and power-ups from my text file into the blocks and powers ArrayLists which represent these objects. This code is easy to understand because it should how I take the double from my text file and manipulate it such that I get a value from before the decimal place to decide which kind of block to add, if there is a block to be added (!=0), and then the value after the decimal place is put into the y variable, which then represents a certain type of power-up. Another aspect worthy of note is that the power-up is placed in the center of the brick which it was assigned to, for later use in choosing when to activate a power-up. 
	Second piece of code to be described:
	
'''java
	/**
	 * Parses through all blocs in ArrayList bricks and check if a ball is to be bounced
	 */
	public int bounce (Brick b, int brickHits, int BLOCK_HEIGHT, int BLOCK_WIDTH) {
		brickHits++;
		hitCount--;
		if (this.getCenterY() >= b.getY() && 
				this.getCenterY() <= b.getY() + BLOCK_HEIGHT) {
			this.setCenterX(this.getCenterX() - 3*XSpeed);
			XSpeed = -XSpeed;
		}
		else if (this.getCenterX() >= b.getX() && 
				this.getCenterX() <= b.getX() + BLOCK_WIDTH) {
			this.setCenterY(this.getCenterY() - 3*YSpeed);
			YSpeed = -YSpeed;
		}
		else {			
			double bcenterX = b.getX() + BLOCK_WIDTH/2;
			double bcenterY = b.getY() + BLOCK_HEIGHT/2;
			double distance = this.getRadius();
			if (this.getCenterX() > bcenterX) {
				if (this.getCenterY() > bcenterY) {
					bcenterX = bcenterX + BLOCK_WIDTH/2;
					bcenterY = bcenterY + BLOCK_HEIGHT/2;
				}
				else {
					bcenterX = bcenterX + BLOCK_WIDTH/2;
					bcenterY = bcenterY - BLOCK_HEIGHT/2;
				}
			}
			else {
				if (this.getCenterY() > bcenterY) {
					bcenterX = bcenterX - BLOCK_WIDTH/2;
					bcenterY = bcenterY + BLOCK_HEIGHT/2;
				}
				else {
					bcenterX = bcenterX - BLOCK_WIDTH/2;
					bcenterY = bcenterY - BLOCK_HEIGHT/2;
				}
			}
			XSpeed = (14/distance)*((this.getCenterX() - bcenterX)/distance);
			YSpeed = (14/distance)*((this.getCenterX() - bcenterX)/distance);
			this.setCenterX(this.getCenterX() + 3*XSpeed);
			this.setCenterY(this.getCenterY() + 3*YSpeed);
		}
		return brickHits;
	}
'''

	This here is my much referred to bounce method from class Ball. It is a type int because it returns the amount of times the ball has hit a brick to the main method, and in order to do this brickHits is passed to the method. It then reduces the hitCount of the ball, lessening a potential power-up lifespan. Then the main part of the method first tests if the ball is strictly left or right to the brick, which would mean a pure change in XSpeed. The next case is for if the ball is directly above or below the brick, which means it would bounce and solely change the YSpeed. The final case I deal with the corner case, where I deal with all four corners explicitly and change the direction vectors accordingly, with some momentum based on how it collides. This is a hard to read method, as it does many if's and else's without really being clear why a case results in a certain action. It also is supposed to be a void method but uses an return int, another example of back-road dependencies. Lastly, the corner bounce method still doesn't fully work. 
	
### Design

	*Reflect on how the program is currently organized.

	**Describe the overall design of the program, without referring to specific data structures or actual code.
	**As briefly as possible, describe how to add a new level to the game.
	**Justify why your overall code is designed the way it is or what issues you wrestled with if you think its design is lacking in some way. Are there any assumptions or dependencies in your code that impact the overall design of the program?
	**Describe two features from the assignment specification in detail:
	***What classes or resources are required to implement this feature?
	***Describe the design of this feature in detail (what implementation details are encapsulated? 	***what assumptions are made? do they limit its flexibility?).
	
	The overall design of the program uses five methods that set up the game and allow it to be playable. There are then a handful of other methods that act as smaller helper methods, that make the code cleaner in certain spots where there would be repetition. These five methods start the game, set up the scene, make a level, run the game, and take key input. The first three are sequential when booting up the game, leading the last two to be run simultaneously. There are then five classes, Ball, Laser, Paddle, Brick, and PowerUp that represent all the objects in the game. And throughout these methods they are added to the program and then manipulated. 
	In order to add a new level to the game you need to make a text file of doubles, then create a String with that text files name. In the set up level method you would have to add an if statement for currentLevel == 4, choosing where to start the first row of bricks. Then you would have to call the nextLevel method and a new level would be added. 
	The issues that a wrestled with was the data dependencies between classes and the main BreakoutGame method. This is due to my originally keeping methods in the main class, without really keeping data dependencies in mind when coding for the first 70% of the project. This then impacts the cohesiveness of the code and relies upon manipulation to keep variable updated when they should. 
	First feature:
	Additional paddle on top of the screen. In order to implement this feature I just needed to re-use the already made Paddle class. The way this 'other' paddle works is that it is only active when the ball is on the top of the screen, so in order to determine whether or not it can be moved the ball's y position is needed constantly. Otherwise the paddle functions the same and just needed to check for more cases if the ball intersects it or goes off the top of the screen. Another aspect to the paddle is that if the ball hits this 'other' paddle then hits a power-up block, the power-up goes to this paddle and only this paddle can use the power-up. This is why they are separate objects and not linked together to allow for this flexibility. 
	Second feature:
	Penetrating power on the ball. The classes used to implement this feature are the Brick, PowerUp, Paddle, and Ball classes. The Brick class is used to contain the power-up inside it, as the method checkPowers(Brick b) uses a specific brick's coordinates to confirm a power-up is inside. Then the power-up drops (or rises) from the Brick, containing just a state value to be transferred to the paddle that intersects it. If the state value is a certain value, the paddle with keep the power-up and use it, otherwise it passes the state value onto the Ball class, who finally uses the power-up by setting its hitCount to six and then counting down every time it hits a block until the power-up is over. In addition to that, the penetrating power is calculated seeing the state of the ball when deciding how many layers to break. This is not particularly flexible, as many things have to happen in consequence in order for the ball to be fully powered up, with each step being specific to a certain scenario happening. 



### Alternate Designs

	*Reflect on alternate designs for the project based on your analysis of the current design.
	
	**Describe two design decisions you made, or wish you had done differently, in detail:
	***What alternate designs were considered?
	***What are the trade-offs of the design choice (describe the pros and cons of the different designs)?
	***Which would you prefer and why (it does not have to be the one that is currently implemented)?
	**What are the three most important bugs that remain in the project's design or implementation?
	
	First design decision:
	Making two direction vectors, XSpeed and YSpeed, to choose how the ball moves. An alternate design that was considered was using one direction vector for the ball and just updating it based on the angle it intersects any object with. The pros of XSpeed and YSpeed is that it is easy to choose where the ball moves without calculating any angles and can reverse direction just by multiplying one of the vectors by -1. The cons is that any time the angle is changed that I must figured out where the ball is to move in two different dimensions as compared to one and that its speed is the magnitude of both vectors added together verses when with one direction vector the real speed is easily accessible/changeable. I would prefer the one direction option, as I would be able to manipulate how fast the ball moves and just let it bounce off of most surfaces (corners too I assume). 
	Second design decision:
	Making speed of ball dependent on where it hits on the paddle. This makes the game a bit choppy as in order to get the ball to move faster it must be hit on the outside of the paddle, and if you do hit the inside of the paddle the ball moves quite slowly, as the speed multiplier is proportional to the distance from the center of paddle. An alternate design I considered was keeping speed constant from the paddle, and cut up the paddle into section to decide maybe, five, different option for how to change the ball speed, which would be easier to control, as supposed to a continuous value based off an arbitrary distance. 
	Three most important bugs remaining:
	-The ball 'chews up' block when hitting a corner from the side, can go very slowly if hits the corner at a small angle.
	-If the ball is caught between the paddle and the side of the screen, the ball will get stuck in the side of the screen, with no way to end the level. 
	-The multiple poorly designed data dependencies between classes, with main culprits being the other paddle, SIZE int, and brickHits int


