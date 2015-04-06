package com.locomoto.robotsimuation.service;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.TypeSafeMatcher;

import com.locomoto.robotsimulation.model.Direction;
import com.locomoto.robotsimulation.model.Robot;

import static java.lang.String.format;

/**
 * User: rajesh
 */
public class RobotMatcher extends TypeSafeMatcher<Robot> {

    private int x;

    private int y;

    private Direction facingDirection;

    private boolean isOnBoard;

    public RobotMatcher(int x, int y, Direction facingDirection, boolean onBoard) {
        this.x = x;
        this.y = y;
        this.facingDirection = facingDirection;
        isOnBoard = onBoard;
    }

    @Override
    public boolean matchesSafely(Robot robot) {
        return (robot.getX()==x) && 
                (robot.getY()==y) && 
                (robot.getFacingDirection() == facingDirection) &&
                (robot.isOnBoard() == isOnBoard);
    }

    public void describeTo(Description description) {
        description.appendText(format("Expected robot state: (x,y,facing direction, on board) [%d,%d,%s,%s]", x, y, facingDirection, isOnBoard));
    }

    @Factory
    public static RobotMatcher isNotOnBoard() {
        return new RobotMatcher(0, 0, null, false);
    }

    @Factory
    public static RobotMatcher isOnBoard(int x, int y, Direction facingDirection) {
        return new RobotMatcher(x, y, facingDirection, true);
    }
}
