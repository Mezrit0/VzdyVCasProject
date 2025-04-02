package Tests;


import World.Location;
import World.WorldMap;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class GoTest {

    @Test
    public void testMoveEastFromWindGate() {

        HashMap<Integer, Location> testWorld = new HashMap<>();
        testWorld.put(0, new Location("Benzinka", 0, new String[]{"-1", "-1", "1","-1",}));
        testWorld.put(1, new Location("Sklep", 1, new String[]{"-1", "-1", "-1","1",}));

        WorldMap worldMap = new WorldMap();
        worldMap.setWorld(testWorld);

        String result = worldMap.move("east");

        assertEquals("you cant move in this direction", result);
        assertEquals(0, WorldMap.getCurrentPosition2());

    }

    @Test
    public void testMoveBlockedDirection() {
        HashMap<Integer, Location> testWorld = new HashMap<>();
        testWorld.put(0, new Location("Wind Gate", 0, new String[]{"-1", "-1", "1","-1",}));

        WorldMap worldMap = new WorldMap();
        worldMap.setWorld(testWorld);

        String result = worldMap.move("west");

        assertEquals("You can't move in this direction", result);
        assertEquals(0, WorldMap.getCurrentPosition2());
    }

    @Test

    public void testInvalidDirectionInput() {
        WorldMap worldMap = new WorldMap();
        String result = worldMap.move("up");

        assertEquals("invalid move, type only these directions: north , south , east , west " , result);
    }
}
