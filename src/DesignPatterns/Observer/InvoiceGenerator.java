package DesignPatterns.Observer;

public class InvoiceGenerator implements OrderPlacedSubscriber {

    public InvoiceGenerator() {
        Amazon amazon = Amazon.getInstance();
        amazon.subscribe(this);
    }

    @Override
    public void onOrderPlaced(String order) {
        System.out.println("Invoice generated for order: " + order);
    }
}
