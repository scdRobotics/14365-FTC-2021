package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import java.util.Map;

// TODO: Add wobble grab support

@Autonomous(name="MovementTestAndroidStudio", group="linearOpMode")
public class MovementTest extends AutonomousPrimeTest{
    @Override
    public void runOpMode(){
        mapObjects();
        waitForStart();

        //launch speed start = 0.42
        //launch speed second = 0.465
        //launch function is launchAdvanceFast

        double version = 1;

        //Version 0 is 4 rings
        //Version 1 is 1 ring
        //Version 2 is 0 rings

        if(version==0){
            wobbleLock();
            startLaunch(0.42);
            forwardEncoder(160, 1);
            zeroBotEncoder(1);
            //pause(0.2);
            launchAdvanceFast();
            launchAdvanceFast();
            strafeLeftEncoder(25, 1);
            zeroBotEncoder(1);
            pause(0.1);
            launchAdvanceFast();
            //launchAdvanceFast();
            strafeLeftEncoder(20, 1);
            zeroBotEncoder(1);
            pause(0.1);
            launchAdvanceFast();
            //pause(0.2);

            intakeStart(1);
            startLaunch(0.4455);
            //strafeRightEncoder(87, 0.75);
            strafeRightEncoder(87, 1);

            zeroBotEncoder(1);
            pause(0.2);
            //reverseEncoder(45, 0.35);
            reverseEncoder(45, 0.4);

            zeroBotEncoder(1);
            pause(0.5);
            launchAdvanceFast();
            reverseEncoder(9, 0.5);
            pause(0.5);
            launchAdvanceFast();
            reverseEncoder(9, 0.5);

            startLaunch(0.45);

            pause(0.5);
            launchAdvanceFast ();
            reverseEncoder(9, 0.5);
            pause(0.5);
            launchAdvanceFast();
            pause(0.5);
            launchAdvanceFast();
            pause(0.25);
            intakeEnd();

            rightEncoder(0.225, 1);
            pause(0.1);
            forwardEncoder(210, 1);
            wobbleRelease();
            pause(0.1);
            reverseEncoder(95, 1);
        }
        else if(version==1){
            startLaunch(0.42);
            wobbleLock();
            forwardEncoder(160, 1);
            zeroBotEncoder(1);
            pause(0.2);
            launchAdvanceFast();
            launchAdvanceFast();
            strafeLeftEncoder(25, 1);
            zeroBotEncoder(1);
            pause(0.2);
            launchAdvanceFast();
            strafeLeftEncoder(20, 1);
            zeroBotEncoder(1);
            pause(0.2);
            launchAdvanceFast();
            pause(0.2);

            intakeStart(1);
            startLaunch(0.4455);
            strafeRightEncoder(87, 1);
            zeroBotEncoder(1);
            pause(0.2);
            reverseEncoder(45, 1);
            pause(0.5);
            launchAdvanceFast();
            pause(0.2);
            intakeEnd();

            forwardEncoder(120, 1);
            zeroBotEncoder(1);
            pause(0.1);
            strafeLeftEncoder(50, 1);
            zeroBotEncoder(1);
            wobbleRelease();
            pause(0.25);
            reverseEncoder(70, 1);
            zeroBotEncoder(1);
            pause(0.1);

            strafeRightEncoder(95, 1);
            zeroBotEncoder(1);
            pause(0.1);
            reverseEncoder(85, 1);
            pause(2);
            rightEncoder(1.75, 1);
            pause(0.2);
            strafeLeftEncoder(150, 1);
        }
        else if(version==2){
            startLaunch(0.42);
            forwardEncoder(160, 1);
            zeroBotEncoder(1);
            pause(0.2);
            launchAdvanceFast();
            strafeLeftEncoder(25, 1);
            zeroBotEncoder(1);
            pause(0.2);
            launchAdvanceFast();
            strafeLeftEncoder(20, 1);
            zeroBotEncoder(1);
            pause(0.2);
            launchAdvanceFast();
            pause(0.2);

            forwardEncoder(20, 1);
            pause(0.2);
            strafeRightEncoder(87, 1);
            pause(0.2);
            reverseEncoder(70, 1);
            pause(3); //Grab wobble
            leftEncoder(1.5, 1);
            pause(0.2);
            strafeLeftEncoder(120, 1);
            wobbleRelease();
            pause(1.5);
            strafeRightEncoder(60, 1);
        }
    }
}