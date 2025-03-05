package Items;

public class Key extends Item{

    private char doorIndex;

    public Key(String name, String description, char doorIndex) {
        super(name, description);
        this.doorIndex = doorIndex;
    }

    @Override
    public void use() {

    }
}
