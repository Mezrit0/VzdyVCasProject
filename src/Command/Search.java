package Command;

import World.Location;

public class Search implements Command {

    Location location;

    @Override
    public String execute() {
        return location.getItems().toString();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
