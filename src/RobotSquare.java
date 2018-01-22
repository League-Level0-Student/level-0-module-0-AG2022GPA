
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
            Robot burrito = new Robot();
             burrito.sparkle();
        // 3. Put the robot's pen down
           Robot.setWindowSize(1000, 1000);
             burrito.penDown();
            burrito.setPenColor(Color.YELLOW);
        // 6. Make the robot move as fast as possible
          String input = JOptionPane.showInputDialog("Do you want the line to be green or blue?");
            if(input.equalsIgnoreCase("green")) {
            	burrito.setPenColor(Color.GREEN);
            }
            if(input.equalsIgnoreCase("blue")) {
            burrito.setPenColor(Color.BLUE);
            }
            if(input.equalsIgnoreCase("red")) {
                    burrito.setPenColor(Color.RED);         
            }

            burrito.setSpeed(25);

              burrito.setWindowColor(Color.BLACK);
        // 5. Do everything below here 4 times
             for (int i = 0; i < 4; i++) {
				
			

        //         2. Move your robot 200 pixels

                    burrito.move(200);
        //         4. Turn the robot 90 degrees to the right (90 degrees)
                          burrito.turn(90);
             }
    }
}