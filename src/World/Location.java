package World;

import Items.Item;


import java.util.ArrayList;
import java.util.Arrays;

public class Location {

    private String name;
    private int ID;
    private int[] locations;
    private ArrayList<Item> items;
//    private ArrayList<Location> neighbors;
    private boolean hideable;
    private boolean locked;


    public Location(String name, int ID, String[] locations) {
        this.name = name;
        this.ID = ID;
        this.locations = new int[4];

        for (int i = 0; i < locations.length; i++) {
            this.locations[i] = Integer.parseInt(locations[i]);
        }

        if (name.equals("Obyvaci Pokoj") || name.equals("Garaz") || name.equals("Loznice")){
            this.hideable = true;
        }else {
            this.hideable = false;
        }

        if (name.equals("Hlavni Vchod")){
            this.locked = true;
        }else {
            this.locked = false;
        }

    }
//
//    public void setNeighbors(ArrayList<Location> neighbors) {
//        this.neighbors = neighbors;
//    }

    public boolean isHideable() {
        return hideable;
    }

    public void setHideable(boolean hideable) {
        this.hideable = hideable;
    }

    public int setID(int ID) {
        this.ID = ID;
        return ID;
    }

//    public void setNeighbors(Location location) {
//        if (!neighbors.contains(location)) {
//            neighbors.add(location);
//            location.getNeighbors().add(this);
//        }
//    }
//    public ArrayList<Location> getNeighbors() {
//        return neighbors;
//    }



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

    public void setLocations(int[] locations) {
        this.locations = locations;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
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