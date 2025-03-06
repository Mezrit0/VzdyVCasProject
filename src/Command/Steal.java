package Command;

import Items.Inventory;
import Items.Item;
import Items.Valuable;

public class Steal implements Command{

    Valuable valuable;
    Inventory inventory;

    @Override
    public String execute() {
        inventory.getItems().add(valuable);
        return "We gettin rich with this one";
    }

    @Override
    public boolean exit() {
        return false;
    }


}
