package Entities;

import Items.Item;
import World.Location;

import java.util.ArrayList;

public class Player {

    private Location location;
    private ArrayList<Item> inventory;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }
}
