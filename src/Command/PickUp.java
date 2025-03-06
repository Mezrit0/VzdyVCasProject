package Command;

import Items.Inventory;
import Items.Item;
import World.Location;

public class PickUp implements Command {

    Item item;
    Inventory inventory;
    Location location;

    @Override
    public String execute() {
        for (int i = 0; i < location.getItems().length; i++) {
            if (item.getName().equals(location.getItems())){
                inventory.getItems().add(item);

            }
        }



        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
