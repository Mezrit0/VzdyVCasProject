package Command;

import Items.Inventory;
import Items.Item;
import World.WorldMap;

public class UseItem implements Command {
    private WorldMap world;


    public void setWorld(WorldMap world) {
        this.world = world;
    }

    Inventory inventory;
    Item item;


    @Override
    public String execute() {
        if (inventory.getItems().contains(item)){
            item.use();
            inventory.getItems().remove(item);
            return "you've used " + item.getName();
        }else {
            return "Item is not in your inventory";
        }
    }


    @Override
    public boolean exit() {
        return false;
    }
}
