package Command;

import World.Location;
import World.WorldMap;

public class Search implements Command {
    private WorldMap world;


    public void setWorld(WorldMap world) {
        this.world = new WorldMap();
    }



    @Override
    public String execute() {
        setWorld(world);
        if (!world.getCurrentPosition().getItems().isEmpty()) {
            return world.getCurrentPosition().getItems().toString();
        } else{
            return "Room doesnt have any items";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
