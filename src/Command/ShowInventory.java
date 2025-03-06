package Command;

import Items.Inventory;

import java.util.ArrayList;

public class ShowInventory implements Command {

    Inventory inventory;

    ArrayList<String> list;
    @Override
    public String execute() {
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
