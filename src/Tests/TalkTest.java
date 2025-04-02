package Tests;

import Command.Text;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TalkTest {
    @Test
    public void execute() {
        Text text = new Text();

        String expected = "Who to talk?";
        assertEquals(expected , text.execute());
    }
}

