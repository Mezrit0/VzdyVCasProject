package Command;

import World.Location;
import World.WorldMap;

import java.util.Scanner;

public class GoTo implements Command {
    private Scanner scanner = new Scanner(System.in);
    private Location currentLocation = new Location();
    private WorldMap world = new WorldMap();

    /* 0 - Sever,
     * 1 - Východ,
     * 2 - Jih,
     * 3 - Západ
     */
    @Override
    public String execute() {
        currentLocation = world.getCurrentPosition();
        System.out.println("where u wanna go");
        String direction = scanner.next();
        System.out.println(currentLocation);

        int index = -1; // north 0, south 1, west 2, east 3
        switch (direction) {
            case "north":
                index = 0;
                break;
            case "south":
                index = 1;
                break;
            case "west":
                index = 2;
                break;
            case "east":
                index = 3;
                break;
            default:
                System.out.println("Not valid move try (north, south, west, east");
                return null;
        }

        int newLocation = currentLocation.setID(index);
        if (newLocation == -1){
            return null;
        }

        world.setNewPosition(newLocation);
        Location newLoc = world.getCurrentPosition();
        System.out.println("you've moved to: " + newLoc.toString());

        return newLoc.toString();

    }

    @Override
    public boolean exit() {
        return false;
    }
}
