package Items;

import World.Location;

public class Key extends Item {

    private char doorIndex;
    private Location location;

    public Key(String name, String description, char doorIndex) {
        super(name, description);
        this.doorIndex = doorIndex;
    }

    @Override
    public void use() {
        if (doorIndex == location.getID()) {
            location.setLocked(false);
        }
    }
}
