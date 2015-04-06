package com.locomoto.robotsimulation.helper;

/**
 * Exception to indicate that the given coordinate is invalid and cannot be represented as
 * a coordinate in the board
 * <p/>
  * author:rajesh
 * version:1.0.1
 */
public class InvalidCoordinateException extends InvalidCommandException {

    public InvalidCoordinateException(String coordinate) {
        super(String.format("Value [%s] cannot be parsed into a valid board coordinate.", coordinate));
    }
}
