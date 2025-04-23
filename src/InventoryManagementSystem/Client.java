package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        /*List<Item> items = new ArrayList<Item>();

        items.add(new Electronics("E1", "Laptop",999.99, 5, 24));
        items.add(new Clothing("C1", "T-Shirt", 19.99, 100, "M"));
        items.add(new Book("B1", "Java Programming", 59.99, 50,"John Doe"));
        System.out.println("Items List : ");
        for (Item item : items) {
            System.out.println(item.getName());
        }

        Collections.sort(items);

        System.out.println("After Sorting");
        for (Item item : items) {
            System.out.println(item.getName());
        }

        Collections.sort(items, new ItemQuantityComparator());

        System.out.println("After Sorting based on Quantity");
        for (Item item : items) {
            System.out.println(item.getName());
        }*/

        /*Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.addItem(new Electronics("E1", "Laptop",  999.99 , 5, 24));
        electronicsInventory.addItem(new Electronics("E2", "Laptop" ,  999.99 ,5, 24));
        electronicsInventory.addItem(new Electronics("E3", "Mobile", 99.99, 5, 24));

        List<Electronics> electronics = electronicsInventory.getAllItems();
        System.out.println("Electronics List : ");
        for (Electronics item : electronics) {
            System.out.println(item.getId() + " " +item.getName());
        }*/
        Item item1 = new Electronics("E1", "Laptop",  999.99,5,  24);
        Item item2 = new Electronics("E2", "Mobile", 999.99, 5, 24);
        Item item3 = new Electronics("E3", "Watch",  999.99, 5,  24);
        Item item4 = new Electronics("E4", "Ipad", 999.99, 5, 24);
        Item item5 = new Electronics("E5", "Speaker", 999.99, 5, 24);

        RecentlyViewItems recentlyViewItems = new RecentlyViewItems();
        recentlyViewItems.addItem(item1);
        recentlyViewItems.addItem(item2);
        recentlyViewItems.addItem(item3);
        recentlyViewItems.addItem(item4);
        recentlyViewItems.addItem(item5);
        recentlyViewItems.addItem(item1);

        System.out.println("RecentlyViewedItems List : ");
        List<Item> recentlyViewedItemsList = recentlyViewItems.getItems();
        for (Item item : recentlyViewedItemsList) {
            System.out.println(item.getName());
        }

    }

    // O1 O2 2
}
