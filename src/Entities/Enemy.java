package Entities;

import World.Location;
import World.WorldMap;

import java.util.Random;

public class Enemy {
    private Location location;
    private WorldMap worldMap;
    private int health;




    public Enemy(Location startLocation, WorldMap worldMap) {
        this.location = startLocation;
        this.worldMap = worldMap;
        this.health = 100;
    }

    /**
     * if meets player, and he chooses to fight his enemies than enemy will defend
     * @param player
     */

    public void attack(Player player) {
        player.takeDamage(10);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isDead(){
        if (health == 0){
            return true;
        }else {
            return false;
        }
    }

//    public void chasePlayer(Enemy enemy, Player player){
//        if (player.getLocation() == enemy.getLocation()){
//
//            enemy.moveRandombly(player.getLocation());
//        } else if (player.isHided()) {
//            enemy.moveRandombly(location);
//        }
//    }

//    public void moveRandombly(Location loc) {
//        Random random = new Random();
//        if (location.getNeighbors().contains(loc)) {
//            Location newLocation = worldMap.getWorld().get(random.nextInt(worldMap.getWorld().size()));
//        }
//    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
