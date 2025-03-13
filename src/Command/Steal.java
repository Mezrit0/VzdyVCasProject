package Command;

import Items.Inventory;
import Items.Valuable;
import World.Location;

public class Steal implements Command{

    private Valuable valuable;
    private Inventory inventory;
    private Location location;

    @Override
    public String execute() {
        if (location.getItems().contains(valuable)) {
            inventory.getItems().add(valuable);
            return "We gettin rich with this one";
        }else{
            return "There's no valuable here";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }


}
