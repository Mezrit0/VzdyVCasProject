package Tests;

import Command.Help;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelpTest {
    @Test
    public void execute() {
        Help help = new Help();

        String expected = """
                go - allows you to move
                fight - Fight someone
                hide - Hide somewhere
                opendoor - opens door
                quit - ends the game
                search - searches for items
                """;

                assertEquals(expected , help.execute());
    }
}
