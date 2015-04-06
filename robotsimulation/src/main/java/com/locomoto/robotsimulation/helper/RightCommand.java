package com.locomoto.robotsimulation.helper;

import org.apache.commons.lang.StringUtils;

import com.locomoto.robotsimulation.model.Robot;

/**
 * A command to tell the robot to turn 90 degree to the right
 * <p/>
 * author:rajesh
 * version:1.0.1
 */
public class RightCommand implements Command{
    public static final String COMMAND = "RIGHT";

    /**
     * @param commandString command string
     * @return <code>true</code> if the command can be supported by this class,
     * <code>false</code> otherwise
     */
    public static boolean hasSupportFor(String commandString) {
        return StringUtils.equals(RightCommand.COMMAND, commandString);
    }

    /**
     * Create instance of this class from the given string
     * <p/>
     * @param commandString command string
     * @return instance of {@link RightCommand} command
     */
    public static RightCommand createFromString(String commandString) {
        // there is no extra information contained in the RIGHT command.
        return new RightCommand();
    }

    /**
     * @see com.locomoto.robotsimulation.model.Robot#turnRight()
     */
    public void execute(Robot robot) throws InvalidRobotMovementException {
        robot.turnRight();
    }
}
