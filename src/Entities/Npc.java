package Entities;

import Command.Text;
import World.Location;

public class Npc {

    private Location location;
    private Text text;

    public Npc(Location location, Text text) {
        this.location = location;
        this.text = text;
    }

    public String getText() {
        return text.execute();
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
