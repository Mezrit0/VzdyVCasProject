package Items;

import java.util.ArrayList;

public class Inventory {

    private static ArrayList<Item> items = new ArrayList<>();

    /**
     * adds item into the list as inventory
     * @param item
     * @return
     */

    public static String addItem(Item item) {
        if (item != null) {
            items.add(item);
            return "Item was added: " + item.getName();
        }else {
            return "Item doesn't exist";
        }
    }

    /**
     * removes the item from the list
     * @param item
     * @return
     */

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

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
