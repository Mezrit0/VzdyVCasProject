package Tests;


import Items.Food;
import Items.Inventory;
import Items.Item;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


class InventoryTest {

    @Test
    void testAddItem() {

        Item item = new Food("Test food", "Heals 10 health");

        Inventory.addItem(item);

        List<Item> inventory = new Inventory().getItems();

        assertFalse("Backpack should not be empty.", inventory.isEmpty());
        assertEquals("Backpack should contain one item.", inventory.size());
        assertEquals("Test potion" , inventory.get(0).getName(), "Item name should match.");


    }
}
