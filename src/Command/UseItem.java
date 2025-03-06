package Command;

import Items.Inventory;
import Items.Item;

public class UseItem implements Command {

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
