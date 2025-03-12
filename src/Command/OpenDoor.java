package Command;

import Entities.Player;

import Items.Key;
import World.Location;

public class OpenDoor implements Command {


    private Player player;
    private Location lockedRoom;

    @Override
    public String execute() {
        Key key = new Key();
        if (player.getInventory().hasItem(key)) {
            return "You've opened " + lockedRoom.getName();
        } else {
            return "You don't have keys for this room";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
