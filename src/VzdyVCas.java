import Entities.Player;
import World.Location;
import World.WorldMap;

public class VzdyVCas {
    private Player player;
    private WorldMap worldMap;
    private Console  console;


    public VzdyVCas() {
        this.worldMap = new WorldMap();
        this.console = new Console();



        worldMap.loadMap();
        console.start();


    }
}
