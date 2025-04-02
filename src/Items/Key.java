package Items;

import World.Location;

public class Key extends Item {

    private int doorIndex;
    private Location location;

    public Key(String name, String description, int doorIndex) {
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
