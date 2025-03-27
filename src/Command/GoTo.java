package Command;

import World.Location;
import World.WorldMap;

import java.util.Scanner;

public class GoTo implements Command {
    private Scanner scanner = new Scanner(System.in);
    private Location currentLocation;
    private WorldMap world;

    public GoTo(WorldMap world){
        this.world = world;
    }

    @Override
    public String execute() {
        System.out.println("Where do you want to go to?");
        String direction = "";
        direction = scanner.next();
        direction.toLowerCase();
        while (!direction.equals("north") && !direction.equals("south") && !direction.equals("west") && !direction.equals("east")) {
            System.out.println("not valid move");
            direction = scanner.next();
            direction.toLowerCase();
        }
        System.out.println(world.move(direction));
        return "";

    }

    @Override
    public boolean exit() {
        return false;
    }
}
