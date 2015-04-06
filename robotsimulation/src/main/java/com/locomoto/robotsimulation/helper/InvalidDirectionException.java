package com.locomoto.robotsimulation.helper;

/**
 * Exception to indicate that an unknown direction had been issued.
 * @see com.locomoto.robotsimulation.model.Direction for valid directions
 * <p/>
 * author:rajesh
 * version:1.0.1
 */
public class InvalidDirectionException extends InvalidCommandException {
    private final String direction;

    /**
     * @param direction the direction
     */
    public InvalidDirectionException(String direction) {
        super(String.format("Invalid direction has been given [%s]",direction));
        this.direction = direction;
    }

    /**
     * @return the invalid direction
     */
    public String getDirection() {
        return direction;
    }
}
