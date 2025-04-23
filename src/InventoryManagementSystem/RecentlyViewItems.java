package InventoryManagementSystem;

import java.util.LinkedList;

public class RecentlyViewItems {
    private LinkedList<Item> items;
    private int MAX_SIZE = 3;

    public RecentlyViewItems() {
        items = new LinkedList<>();
    }

    public void addItem(Item item) {
        items.remove(item);
        // Remove the item if it already exists
        items.addFirst(item);
        if(items.size() > MAX_SIZE) {
            items.removeLast();
        }
    }

    public LinkedList<Item> getItems() {
        return items;
    }
}
