package Command;

import World.Location;
import World.WorldMap;

public class Hide implements Command {
    private WorldMap world = new WorldMap();



    private Location location;
    @Override
    public String execute() {
        if (location.isHideable()){
            return "Hope he doesn't find you";
        }else {
            return "There's no place to hide";
        }

    }

    @Override
    public boolean exit() {
        return false;
    }
}
