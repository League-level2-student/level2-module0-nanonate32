package arrays;

import java.text.Format;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
static int RobotWinner;
	// 1. make a main method
	public static void main(String[] args) {
		boolean CrossFinishLine = false;
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			System.out.println(robots[i] = new Robot());
			robots[i].setX(200 + 200 * i);
			robots[i].setY(600);
			robots[i].setSpeed(500);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		// 5. use another for loop to iterate through the array and make each robot move
		Random randy = new Random();

		while (CrossFinishLine == false) {
			for (int i = 0; i < robots.length; i++) {
				robots[i].move(randy.nextInt(50));
				
				if (robots[i].getY() <= 100) {
					CrossFinishLine = true;
					RobotWinner = i;
				}
			}

		}
		// 5. a random amount less than 50.

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		if (CrossFinishLine == true) {
			JOptionPane.showMessageDialog(null, "You are the Winner!" + " " + 
		"Robot" +  " " + RobotWinner);
		}              
		// 8. try different races with different amounts of robots.
                                          
		// 9. make the robots race around a circular track.
	}      robots.race(circl
}