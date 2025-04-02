package Command;

import Items.Inventory;
import Items.Item;
import World.WorldMap;

public class UseItem implements Command {
    private Inventory inventory;
    private Item item;

    public void setInventory(Inventory inventory) {
        this.inventory = new Inventory();
    }

    /**
     *  if item is in your inventory, it will be used
     */

    @Override
    public String execute() {
        setInventory(inventory);
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
