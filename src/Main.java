import World.WorldMap;

public class Main {
    public static void main(String[] args) {
        WorldMap wm = new WorldMap();
        wm.loadMap();
        System.out.println(wm.getWorld());


    }
}