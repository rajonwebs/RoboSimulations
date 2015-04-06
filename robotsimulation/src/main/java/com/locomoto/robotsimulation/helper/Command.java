package com.locomoto.robotsimulation.helper;

import com.locomoto.robotsimulation.model.Robot;

/**
 * Interface to all commands that can be executed on the robot
 * <p/>
 * author:rajesh
 * version:1.0.1
 */
public interface Command {

    /**
     * Execute the command on the robot
     * <p/>
     * @param robot {@link Robot}
     * @throws InvalidCommandException when the command cannot be executed with the current robot's state
     */
    void execute(Robot robot)
            throws InvalidCommandException;
}
