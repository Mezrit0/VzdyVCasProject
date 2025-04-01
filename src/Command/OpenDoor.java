package Command;

import Entities.Player;

import Items.Inventory;
import Items.Key;
import World.Location;
import World.WorldMap;

public class OpenDoor implements Command {
    private WorldMap world;


    public void setWorld(WorldMap world) {
        this.world = world;
    }


    private Inventory inventory;
    private Location lockedRoom;
    private Key key;

    public void setInventory(Inventory inventory) {
        this.inventory = new Inventory();
    }



    @Override
    public String execute() {
        setWorld(world);
        setInventory(inventory);
        if (inventory.hasItem(key)) {
            key.use();
            return "You've opened " + lockedRoom.getName();
        } else if (lockedRoom == null) {
            return "that room isn't locked";
        }else {
            return "You don't have keys for this room";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
