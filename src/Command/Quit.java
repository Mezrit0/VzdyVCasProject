package Command;

import World.WorldMap;

public class Quit implements Command {
    private WorldMap world;


    public void setWorld(WorldMap world) {
        this.world = world;
    }

    /**
     * quits the game
     */
    @Override
    public String execute() {
        return "the end";
    }

    /**
     * indicates that this command ends the game
     * @return
     */
    @Override
    public boolean exit() {
        return true;
    }
}
