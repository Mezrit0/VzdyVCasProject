package Command;

import World.WorldMap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Text implements Command {
    private WorldMap world;


    public void setWorld(WorldMap world) {
        this.world = new WorldMap();
    }

    /**
     * if the location you're located in has any backstory or info to give you this command will write it down
     */


    @Override
    public String execute() {
        setWorld(world);
            int aktualniPozice = world.getCurrentPosition().getID();

            switch (aktualniPozice){
                case 0:
                    text1();
                    break;
                case 1:
                    System.out.println("for this location, theres no story");
                    break;
                case 2:
                    text2();
                    break;
                case 3:
                    text3();
                    break;
                case 4:
                    text4();
                    break;
                case 5:
                    System.out.println("for this location, theres no story");
                    break;
                case 6:
                    System.out.println("for this location, theres no story");
                    break;
                case 7:
                    System.out.println("for this location, theres no story");
                    break;
                case 8:
                    text5();
                    break;
                case 9:
                    text7();
                    break;
                case 10:
                    System.out.println("for this location, theres no story");
                    break;
                case 11:
                    System.out.println("for this location, theres no story");
                    break;
                case 12:
                    text6();
                    break;
                default:
                    return "problem in loading text";
            }

            return "";
        }

    public void text1() {
        try (BufferedReader br = new BufferedReader(new FileReader("text1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void text2() {
        try (BufferedReader br = new BufferedReader(new FileReader("text2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void text3() {
        try (BufferedReader br = new BufferedReader(new FileReader("text3.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void text4() {
        try (BufferedReader br = new BufferedReader(new FileReader("text5.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void text5() {
        try (BufferedReader br = new BufferedReader(new FileReader("text6.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void text6() {
        try (BufferedReader br = new BufferedReader(new FileReader("text7.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public void text7() {
        try (BufferedReader br = new BufferedReader(new FileReader("text7.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public boolean exit() {
        return false;
    }
}
