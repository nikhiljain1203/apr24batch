package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class CustomeExceptionClient {
    public static void main(String[] args) {
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        try {
            electronicsInventory.addItem(new Electronics("E1", "Laptop", 999.99, 5, 24));
            electronicsInventory.addItem(new Electronics("E2", "Laptop", 999.99, 5, 24));
            electronicsInventory.addItem(new Electronics("E3", "Mobile", 99.99, 5, 24));
            electronicsInventory.addItem(new Electronics("E3", "Mobile", 99.99, 5, 24));
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        } catch (DuplicateItemException e) {
            System.out.println(e.getMessage());
        }
    }
}
