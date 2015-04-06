package com.locomoto.robotsimulation.service;

import java.io.IOException;

/**
 * Interface of classes which is able to issue {@link com.locomoto.robotsimulation.helper.Command} to
 * the robot
 * <p/>
 *  author:rajesh
 * version:1.0.1
 */
public interface CommanderInf {

    /**
     * @return the next command that can be executed by the robot
     * @throws IOException
     */
    String getNextCommand() throws IOException;

    /**
     * Clean up the commander, freeing up any resources
     */
    void cleanup();
}
