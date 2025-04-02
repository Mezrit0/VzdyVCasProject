package Entities;

import Command.Text;
import World.Location;

public class Npc {

    private Location location;

    public Npc(Location location, Text text) {
        this.location = location;

    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
