package DesignPatterns.Observer;

public class EmailSender implements OrderPlacedSubscriber {

    public EmailSender() {
        Amazon amazon = Amazon.getInstance();
        amazon.subscribe(this);
    }

    @Override
    public void onOrderPlaced(String order) {
        System.out.println("Email sent for order: " + order);
    }
}
