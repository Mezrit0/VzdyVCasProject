package Command;

import World.Location;

public class Search implements Command {

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
