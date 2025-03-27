package Command;

import Items.Inventory;
import Items.Item;
import World.Location;
import World.WorldMap;

public class PickUp implements Command {
    private WorldMap world;


    public void setWorld(WorldMap world) {
        this.world = world;
    }

    Item item;
    Inventory inventory;
    Location location;

    @Override
    public String execute() {
        for (int i = 0; i < location.getItems().size(); i++) {
            if (item.getName().equals(location.getItems().get(i).getName())) {
                inventory.getItems().add(item);
                location.getItems().remove(item);
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
