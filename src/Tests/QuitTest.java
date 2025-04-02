package Tests;
import static org.junit.jupiter.api.Assertions.*;

import Command.Quit;

import org.junit.jupiter.api.Test;
public class QuitTest {
    @Test
    void execute() {
        Quit Quit = new Quit();
            String expected = "The game is over!";
            assertEquals(expected , Quit.execute());
    }


}
