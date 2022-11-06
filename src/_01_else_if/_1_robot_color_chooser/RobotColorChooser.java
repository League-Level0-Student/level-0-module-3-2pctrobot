
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		int count = 0;
		rob.penDown();
		rob.setSpeed(100);
		rob.move(250);
		rob.turn(120);
		rob.move(250);
		rob.turn(120);
		rob.move(250);
		rob.turn(120);
		rob.setPenWidth(10);
		
	    if(count <= 10) {
	    	String color = JOptionPane.showInputDialog("Please select a color out of the provided  one. Red, orange, yellow, green, blue, purple, black and white.");
		if(color.equals("Red")) {
	    	rob.setPenColor(255, 0, 0);
	    }else if(color.equals("Orange")) {
	    	rob.setPenColor(255, 123, 0);
	    }else if(color.equals("Yellow")) {
	    	rob.setPenColor(255, 225, 0);
	    }else if(color.equals("Green")) {
	    	rob.setPenColor(43, 255, 0);
	    }else if(color.equals("Blue")) {
	    	rob.setPenColor(4, 0, 255);
	    }else if(color.equals("Purple")) {
	    	rob.setPenColor(162, 0, 255);
	    }else if(color.equals("Black")) {
	    	rob.setPenColor(0, 0, 0);
	    }else if(color.equals("White")) {
	    	rob.setPenColor(255, 255, 255);
	    }else {
	    	rob.setRandomPenColor();
	    }
	    	rob.penDown();
			rob.setSpeed(100);
			rob.move(250);
			rob.turn(120);
			rob.move(250);
			rob.turn(120);
			rob.move(250);
			rob.turn(120);
	    	count++;
	    }
	    }
		//2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}

