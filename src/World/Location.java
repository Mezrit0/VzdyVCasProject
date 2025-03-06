package World;

import Items.Item;
import Items.Valuable;

import java.util.Arrays;

public class Location extends WorldMap {

    private String name;
    private int ID;
    private int[] locations;
    private Item[] items;


    public Location(){
        this.items = new Item[3];
        for (int i = 0; i < 3; i++) {
            items[i] = new Valuable("wallet", "It has alot of money", true);
        }
    }

    public Location(String name, int ID, String[] locations) {
        this.name = name;
        this.ID = ID;
        this.locations = new int[4];
        for (int i = 0; i < locations.length; i++) {
            this.locations[i] = Integer.parseInt(locations[i]);
        }
    }

    public int setID(int ID) {
        this.ID = ID;
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public int[] getLocations() {
        return locations;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", locations=" + Arrays.toString(locations) +
                '}';
    }
}