package Command;

import Items.Inventory;
import Items.Valuable;
import World.Location;
import World.WorldMap;

public class Steal implements Command{
    private WorldMap world;


    public void setWorld(WorldMap world) {
        this.world = new WorldMap();
    }

    private Valuable valuable;
    private Inventory inventory;

    public void setInventory(Inventory inventory) {
        this.inventory = new Inventory();
    }

    /**
     * same as PickUp but if its valuable then you have to steal it
     */

    @Override
    public String execute() {
        setWorld(world);
        setInventory(inventory);
        if (world.getCurrentPosition().getItems().contains(valuable)) {
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
