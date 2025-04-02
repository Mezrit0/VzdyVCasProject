package Items;

import Entities.Player;

public class Food extends Item{

    private Player player;

    public Food(String name, String description) {
        super(name, description);
    }

    @Override
    public void use() {
        int newHealth = player.getHealth() + 10;
        if (newHealth > 100){
            newHealth = 100;
        }
        player.setHealth(newHealth);
    }
}
