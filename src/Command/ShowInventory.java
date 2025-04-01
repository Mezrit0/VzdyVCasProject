package Command;

import Items.Inventory;
import World.WorldMap;

import java.util.ArrayList;

public class ShowInventory implements Command {
    private WorldMap world;


    public void setWorld(WorldMap world) {
        this.world = world;
    }

    private Inventory inventory;

    public void setInventory(Inventory inventory) {
        this.inventory = new Inventory();
    }

    ArrayList<String> list;
    @Override
    public String execute() {
        setWorld(world);
        setInventory(inventory);
        for (int i = 0; i < inventory.getItems().size(); i++) {
            list.add(inventory.getItems().get(i).toString());
        }
        return list + " this is your inventory";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
