package DesignPatterns.Observer;

public class Client {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        InventoryHandler inventoryHandler = new InventoryHandler();

        Amazon amazon = Amazon.getInstance();
        amazon.orderPlaced("Order #12345");
    }
}
