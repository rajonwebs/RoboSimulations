package com.locomoto.robotsimulation.helper;

/**
 * Exception to indicate that a movement cannot be applied to the robot. Generally
 * it is because the robot is not on the board yet.
 * <p/>
 * author:rajesh
 * version:1.0.1
 */
public class InvalidRobotMovementException extends InvalidCommandException{

    public InvalidRobotMovementException(String reason) {
        super(reason);
    }
}
