package World;

import Items.Food;
import Items.Item;
import Items.Key;
import Items.Valuable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class WorldMap {

    private static HashMap<Integer, Location> world = new HashMap<>();
    private static int start = 0;
    private static int currentPosition = start;
    private Scanner scanner = new Scanner(System.in);
    private HashMap<Integer, ArrayList<Item>> itemsOfLocation = new HashMap<>();


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


    public void addItemsToLoc(){
        if (!itemsOfLocation.containsKey(currentPosition)) {
            ArrayList<Item> items = new ArrayList<>();
            switch (currentPosition) {
                case 2:
                    items.add(new Food("Donut", "Donut is great for your healt right?"));
                    break;
                case 4:
                    items.add(new Valuable("Golden necklase", "Really expensive necklase why not take it?", true));
                    break;
                case 7:
                    items.add(new Key("Keys to garage", "You can open garage duhh", 11));
                    break;
                case 8:
                    items.add(new Valuable("Golden pan", "Golden pan? what these guys be doin", true));
                    items.add(new Food("Cat", "a lot of protein, well at worse situations you can eat it"));
                    break;
                case 10:
                    items.add(new Valuable("Apple TV", "Expensive TV, you could somehow take it with you right?", true));
                    break;
                case 12:
                    items.add(new Key("Keys for the main door", "This one can take you to freedom", 9));
                    break;
            }
            itemsOfLocation.put(currentPosition, items);

        }

    }

    public static void setWorld(HashMap<Integer, Location> world) {
        WorldMap.world = world;
    }

    public static void setStart(int start) {
        WorldMap.start = start;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public HashMap<Integer, ArrayList<Item>> getItemsOfLocation() {
        return itemsOfLocation;
    }

    public void setItemsOfLocation(HashMap<Integer, ArrayList<Item>> itemsOfLocation) {
        this.itemsOfLocation = itemsOfLocation;
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