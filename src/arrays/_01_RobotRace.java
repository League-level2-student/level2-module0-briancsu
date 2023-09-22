package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		boolean yes = false;
		Robot[] arr = new Robot[5];
		for(int i = 0; i  <5; ++i) {
			arr[i] = new Robot();
			arr[i].penUp();
			arr[i].moveTo((i+1)*250, 800);
			arr[i].penDown();
			arr[i].setSpeed(20);
		}
	
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		
		
	while(yes == false) {
		for(int i = 0; i  < 5; ++i) {
			if(arr[i].getY() < 50 ) {
				yes = true;
			}
		}
		Random ran = new Random();
		for(int i = 0; i < 5; ++i) {
			arr[i].move(ran.nextInt(49));
		}

	}
	System.out.println("WINNER!");
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
