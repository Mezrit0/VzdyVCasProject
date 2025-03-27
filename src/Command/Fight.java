package Command;

import Entities.Enemy;
import Entities.Player;
import World.WorldMap;

public class Fight implements Command {
    private WorldMap world;
    private Player player;
    private Enemy enemy;

    public void setWorld(WorldMap world) {
        this.world = world;
    }




    @Override
    public String execute() {
        if (enemy == null) {
            return "No enemy here to fight";
        }else{
           player.attack(enemy);
            if (enemy.isDead()){
                return "You've killed him";
            }else {
                enemy.attack(player);
                return "HE GOT MAD";
            }
        }

    }

    @Override
    public boolean exit() {
        return false;
    }
}
