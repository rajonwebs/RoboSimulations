package com.locomoto.robotsimulation.helper;

/**
 * Abstraction of all exceptions that indicate invalid command had been given by the user
 * <p/>
 * author:rajesh
 * version:1.0.1
 */
public abstract class InvalidCommandException extends Exception {

    public InvalidCommandException(String message) {
        super(message);
    }
}
