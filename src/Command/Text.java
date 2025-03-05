package Command;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Text implements Command {

    public static String giveSpeech(){
        try (BufferedReader br = new BufferedReader(new FileReader("speeches.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                return line;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "";
    }

    @Override
    public String execute() {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
