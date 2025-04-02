package Command;

import Items.Item;
import World.Location;
import World.WorldMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Search implements Command {
    private WorldMap world;
    private Location location;


    public Search(Location location) {
        this.location = location;
    }

    public void setWorld(WorldMap world) {
        this.world = new WorldMap();
    }



    /**
     * if room has some items, it will write it down
     */


    @Override
    public String execute() {
        setWorld(world);
        world.addItemsToLoc();
            if (!world.getItemsOfLocation().isEmpty()) {
            return world.getCurrentPosition().getItems().toString();
            } else{
            return "Room doesnt have any items";
            }

        }

    @Override
    public boolean exit() {
        return false;
    }
}
