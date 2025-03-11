package Items;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
            System.out.println("Byl pridan item: " + item.getName());
        }
    }

    public void removeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println("Odebran predmet: " + item.getName());
        } else {
            System.out.println("Predmet neni v inventory");
        }
    }

    public boolean hasItem(Item item) {
        return items.contains(item);
    }

    public Inventory(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
