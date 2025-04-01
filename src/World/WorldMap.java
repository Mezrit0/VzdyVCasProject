package World;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class WorldMap {

    private static HashMap<Integer, Location> world = new HashMap<>();
    private static int start = 0;
    private static int currentPosition = start;
    private Scanner scanner = new Scanner(System.in);


    public boolean loadMap() {
        try (BufferedReader br = new BufferedReader(new FileReader("worldmap.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lines = line.split(";");
                Location location = new Location(lines[1], Integer.parseInt(lines[0]), Arrays.copyOfRange(lines, 2, 6));
                world.put(Integer.valueOf(lines[0]), location);
            }

            return true;
        } catch (IOException e) {
            return false;
        }

    }


    public Location getCurrentPosition(){
        return world.get(currentPosition);
    }

    static public int getCurrentPosition2(){
        return currentPosition;
    }

    public static int getStart() {
        return start;
    }

    public HashMap<Integer, Location> getWorldMap() {
        return world;
    }

    public String move(String direction){
        int index;
        // north 0, south 1, west 2, east 3
        switch (direction.toLowerCase()) {
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
                return "Not valid move try (north, south, west, east";
        }

        int newLocation = world.get(currentPosition).getLocations()[index];
        if (newLocation == -1){
            return "you can't move this direction";
        }else {
            currentPosition = newLocation;
            return "You have moved this direction at " + world.get(currentPosition).getName();
        }

    }

    public void setNewPosition(int newPosition) {
        if (world.containsKey(newPosition)) {
            currentPosition = newPosition;
        }
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public HashMap<Integer, Location> getWorld() {
        return world;
    }
}