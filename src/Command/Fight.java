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


    /**
     * player attacks first, enemy will defend himself. If player dies the game will end
     * @return
     */

    @Override
    public String execute() {
        setWorld(world);
        if (enemy == null) {
            return "No enemy here to fight";
        }else{
           player.attack(enemy);
            if (enemy.isDead()){
                return "You've killed him";
            } else {
                enemy.attack(player);
                if (player.getHealth() <= 0) {
                    Quit quit = new Quit();
                    quit.execute();
                    return "You died";
                }
                return "HE GOT MAD";
            }
        }

    }

    @Override
    public boolean exit() {
        return false;
    }
}
