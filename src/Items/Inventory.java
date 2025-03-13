package Items;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public String addItem(Item item) {
        if (item != null) {
            items.add(item);
            return "Item was added: " + item.getName();
        }else {
            return "Item doesn't exist";
        }
    }

    public String removeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
            return  "Item was removed: " + item.getName();
        } else {
            return "Item isn't in your inventory";
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
