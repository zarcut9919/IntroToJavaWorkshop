package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

import apple.laf.JRSUIConstants.FrameOnly;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot dave = new Robot();
		dave.setSpeed(5);
		dave.penDown();
		dave.setPenColor(55, 55, 255);
		for(int i = 0; i < 4 ; i++) {
		dave.move(500);
		dave.turn(90);
		}
		
	}
}
