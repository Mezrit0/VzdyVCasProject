package Items;

public class Valuable extends Item {

    private boolean valuable;

    public Valuable(String name, String description, boolean valuable) {
        super(name, description);
        this.valuable = true;
    }

    @Override
    public void use() {

    }
}
