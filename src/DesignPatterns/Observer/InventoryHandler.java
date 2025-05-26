package DesignPatterns.Observer;

public class InventoryHandler implements OrderPlacedSubscriber {

    public InventoryHandler() {
        Amazon amazon = Amazon.getInstance();
        amazon.subscribe(this);
    }

    @Override
    public void onOrderPlaced(String order) {
        System.out.println("Inventory updated for order: " + order);
    }
}
