package Command;

import Items.Inventory;
import Items.Item;
import World.Location;
import World.WorldMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Search implements Command {
    private WorldMap world;
    private Location location;
    private Inventory inventory;


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
        ArrayList<Item> items = world.getItemsOfLocation().getOrDefault(world.getCurrentPosition(), new ArrayList<>());
        if (!items.isEmpty()) {
            for (Item item : new ArrayList<>(items)) {
                inventory.addItem(item);
                System.out.println(item + " has been added to your inventory");
            }
            items.clear();
            return "Items added to your inventory";
        }else{
            return "theres no items here";
        }
    }



    @Override
    public boolean exit() {
        return false;
    }
}
