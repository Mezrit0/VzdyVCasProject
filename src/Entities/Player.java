package Entities;

import Command.Hide;
import Items.Inventory;
import World.Location;
import World.WorldMap;

public class Player {

    private static Location location;
    private static int health = 100;


    /**
     * if player isHided is true, then enemies won't attack
     * @return
     */

    public boolean isHided(){
        if (location.isHideable()){
            return true;
        }
        else {
            return false;
        }
    }

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        Player.health = health;
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


}
