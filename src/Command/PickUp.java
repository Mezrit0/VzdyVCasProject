package Command;

import Items.Inventory;
import Items.Item;
import World.Location;
import World.WorldMap;

public class PickUp implements Command {
    private WorldMap world;


    public void setWorld(WorldMap world) {
        this.world = new WorldMap();
    }

    public void setInventory(Inventory inventory) {
        this.inventory = new Inventory();
    }

    private Item item;
    private Inventory inventory;


    @Override
    public String execute() {
        setInventory(inventory);
        setWorld(world);
        for (int i = 0; i < world.getCurrentPosition().getItems().size(); i++) {
            if (item.getName().equals(world.getCurrentPosition().getItems().get(i).getName())) {
                inventory.getItems().add(item);
                world.getCurrentPosition().getItems().remove(item);
                return "You picked up " + item.getName();
            }
        }

        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
