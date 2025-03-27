package Command;

import Entities.Player;

import Items.Key;
import World.Location;
import World.WorldMap;

public class OpenDoor implements Command {
    private WorldMap world;


    public void setWorld(WorldMap world) {
        this.world = world;
    }


    private Player player;
    private Location lockedRoom;
    private Key key;

    @Override
    public String execute() {
        if (player.getInventory().hasItem(key)) {
            key.use();
            return "You've opened " + lockedRoom.getName();
        } else {
            return "You don't have keys for this room";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
