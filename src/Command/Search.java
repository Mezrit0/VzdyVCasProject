package Command;

import World.Location;
import World.WorldMap;

public class Search implements Command {
    private WorldMap world;


    public void setWorld(WorldMap world) {
        this.world = world;
    }

    Location location;

    @Override
    public String execute() {
        if (!location.getItems().isEmpty()) {
            return location.getItems().toString();
        } else{
            return "Room doesnt have any items";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
