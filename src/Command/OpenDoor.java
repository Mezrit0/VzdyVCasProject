package Command;

import Entities.Player;
import Items.Item;
import World.Location;

public class OpenDoor implements Command {


    private Player player;
    private Location lockedRoom;

    @Override
    public String execute() {
        Item key;
        if (player.getInventory().hasItem(key)) {
            System.out.println("You've opened " + lockedRoom.getName());
            player.;
        } else {
            return "You don't have keys for this room";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
