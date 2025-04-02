package Items;

import java.util.Random;

public class Valuable extends Item {

    private boolean valuable;
    private int cost;
    private Random random = new Random();

    public Valuable(String name, String description, boolean valuable) {
        super(name, description);
        this.valuable = true;
        this.cost = random.nextInt(10, 100);
    }

    @Override
    public void use() {
        System.out.println("you cannot use valuable item");
    }
}
