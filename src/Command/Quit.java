package Command;

import World.WorldMap;

public class Quit implements Command {
    private WorldMap world;


    public void setWorld(WorldMap world) {
        this.world = world;
    }
    @Override
    public String execute() {
        return "the end";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
