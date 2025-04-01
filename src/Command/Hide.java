package Command;

import World.Location;
import World.WorldMap;

public class Hide implements Command {
    private WorldMap world;


    public void setWorld(WorldMap world) {
        this.world = new WorldMap();
    }

    @Override
    public String execute() {
        setWorld(world);
        if (world.getCurrentPosition().isHideable()){
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
