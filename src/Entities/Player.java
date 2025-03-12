package Entities;

import Items.Inventory;
import World.Location;

public class Player {

    private Location location;
    private Inventory inventory;
    private int health;

    public Player(Location location, Inventory inventory, int health) {
        this.location = location;
        this.inventory = inventory;
        this.health = health;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(10);
    }

    public void takeDamage(int damage) {
        health -= damage;
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
