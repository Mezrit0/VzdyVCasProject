package Entities;

import Items.Inventory;
import World.Location;

public class Player {

    private Location location;
    private Inventory inventory;

    public Player(Location location, Inventory inventory) {
        this.location = location;
        this.inventory = inventory;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
