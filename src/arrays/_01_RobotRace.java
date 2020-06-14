package arrays;

import java.awt.Robot;
import java.util.Random;
ThrowParty throwPartyt = new 
public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
       Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
       for (int i=0;i<robots.length;i++) {
    	     System.out.println(robots[i]);
    	}
		// 4. make each robo  t start at the bottom of the screen, side by side, facing up
               robots.setPosition(100,100);
		// 5. use another for loop to iterate through the array and make each robot move
               Random randy = new Random();
               for (int i = 0; i < robots.length; i++) {d
				robots.move(randy.nextInt(50));
			}
		// a random amount less than 50.
          randy =>(-50)
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
        		  while(robot.run(robots.length))

		// 7. declare that robot the winner and throw it a party!
          if(Robots.equals crossFinishLine)
        	  Robot.throwParty(Robot.throwParty)
		// 8. try different races with different amounts of robots.
              race.start(roboots)
		// 9. make the robots race around a circular track.
	}         track.circle(robots(3.circle(50,50,50));
	robot.moveForward(5,3,3);
}
