package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {
    private HashMap<String, T> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void addItem(T item) throws InvalidQuantityException {
        if(item.getQuantity() < 0) {
            throw new InvalidQuantityException("Quantity cannot be negative " +  item.getId());
        }
        if(items.containsKey(item.getId())) {
            throw new DuplicateItemException("Item already exists");
        }
        items.put(item.getId(), item);
    }

    public void removeItem(String id) {
        items.remove(id);
    }

    public T getItem(String id) {
        return items.get(id);
    }

    public List<T> getAllItems() {
        return new ArrayList<>(items.values());
    }
}
