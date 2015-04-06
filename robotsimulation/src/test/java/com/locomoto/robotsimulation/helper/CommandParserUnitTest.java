package com.locomoto.robotsimulation.helper;

import org.junit.Before;
import org.junit.Test;

import com.locomoto.robotsimuation.service.NullPrintStream;
import com.locomoto.robotsimulation.helper.CommandParser;
import com.locomoto.robotsimulation.helper.InvalidCommandException;
import com.locomoto.robotsimulation.helper.LeftCommand;
import com.locomoto.robotsimulation.helper.MalformedCommandException;
import com.locomoto.robotsimulation.helper.MoveCommand;
import com.locomoto.robotsimulation.helper.PlaceCommand;
import com.locomoto.robotsimulation.helper.ReportCommand;
import com.locomoto.robotsimulation.helper.RightCommand;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

/**
 * User: Rajesh
 */
public class CommandParserUnitTest {

    private CommandParser parser;

    @Before
    public void setup() {
        parser = new CommandParser(new NullPrintStream());
    }
    @Test
    public void should_recognize_MOVE_command() throws InvalidCommandException {
        assertThat(parser.fromString("MOVE"), instanceOf(MoveCommand.class));
        assertThat(parser.fromString(" MOVE "), instanceOf(MoveCommand.class));
        assertThat(parser.fromString("MOVE\n"), instanceOf(MoveCommand.class));
        assertThat(parser.fromString("\tMOVE\t"), instanceOf(MoveCommand.class));
    }

    @Test
    public void should_recognize_LEFT_command() throws InvalidCommandException {
        assertThat(parser.fromString("LEFT"), instanceOf(LeftCommand.class));
        assertThat(parser.fromString(" LEFT "), instanceOf(LeftCommand.class));
        assertThat(parser.fromString("LEFT\n"), instanceOf(LeftCommand.class));
        assertThat(parser.fromString("\tLEFT\t"), instanceOf(LeftCommand.class));
    }

    @Test
    public void should_recognize_RIGHT_command() throws InvalidCommandException {
        assertThat(parser.fromString("RIGHT"), instanceOf(RightCommand.class));
        assertThat(parser.fromString(" RIGHT "), instanceOf(RightCommand.class));
        assertThat(parser.fromString("RIGHT\n"), instanceOf(RightCommand.class));
        assertThat(parser.fromString("\tRIGHT\t"), instanceOf(RightCommand.class));
    }

    @Test
    public void should_recognize_PLACE_command() throws InvalidCommandException {
        assertThat(parser.fromString("PLACE 0,1,NORTH"), instanceOf(PlaceCommand.class));
        assertThat(parser.fromString(" PLACE 0,1,NORTH "), instanceOf(PlaceCommand.class));
        assertThat(parser.fromString(" PLACE 0,1,NORTH\n"), instanceOf(PlaceCommand.class));
        assertThat(parser.fromString(" PLACE 0,1,NORTH\t"), instanceOf(PlaceCommand.class));
    }

    @Test
    public void should_recognize_REPORT_command() throws InvalidCommandException {
        assertThat(parser.fromString("REPORT"), instanceOf(ReportCommand.class));
        assertThat(parser.fromString(" REPORT "), instanceOf(ReportCommand.class));
        assertThat(parser.fromString(" REPORT\n"), instanceOf(ReportCommand.class));
        assertThat(parser.fromString(" REPORT\t"), instanceOf(ReportCommand.class));

    }

    @Test(expected = MalformedCommandException.class)
    public void should_throw_exception_when_given_wrong_command() throws InvalidCommandException{
        parser.fromString("VOODOO_CHICKEN");
    }


}
