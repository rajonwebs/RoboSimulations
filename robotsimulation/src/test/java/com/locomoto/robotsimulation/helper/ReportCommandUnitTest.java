package com.locomoto.robotsimulation.helper;

import org.junit.Before;
import org.junit.Test;

import com.locomoto.robotsimuation.service.NullPrintStream;
import com.locomoto.robotsimulation.helper.ReportCommand;
import com.locomoto.robotsimulation.model.Board;
import com.locomoto.robotsimulation.model.Direction;
import com.locomoto.robotsimulation.model.Robot;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * User: Rajesh
 */
public class ReportCommandUnitTest {

    private Robot robot;
    
    
    @Before
    public void setup() {
        robot = new Robot(new Board(5, 5));
        robot.setX(3);
        robot.setY(4);
        robot.setFacingDirection(Direction.NORTH);
        robot.setOnBoard(true);
    }

    @Test
    public void robot_should_stay_at_the_current_position() {
        new ReportCommand(new NullPrintStream()).execute(robot);

        assertThat(robot.getX(), equalTo(3));
        assertThat(robot.getY(), equalTo(4));
        assertThat(robot.getFacingDirection(), equalTo(Direction.NORTH));
    }
}
