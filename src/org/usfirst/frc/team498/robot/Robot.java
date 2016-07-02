package org.usfirst.frc.team498.robot;


import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
 

public class Robot extends SampleRobot {
	FancyJoystick mainController;
	RobotDrive myRobot; 
	double moveValue;
	public Robot() {
     mainController = new FancyJoystick(0);
     myRobot = new RobotDrive(0, 1);
    }

    
    
     
    public void operatorControl() {
       
        while (isOperatorControl() && isEnabled()) {
        	moveValue = (mainController.getAxis(Axis.RightTrigger) - mainController.getAxis(Axis.LeftTrigger));
         	myRobot.arcadeDrive(moveValue, mainController.getAxis(Axis.RightX));
             
        }
    }

}
