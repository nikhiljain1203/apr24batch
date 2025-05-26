package DesignPatterns.Observer;

import java.util.List;

public class Amazon {
    private static Amazon instance;
    private List<OrderPlacedSubscriber> subscribers;

    public static Amazon getInstance() {
        if (instance == null) {
            instance = new Amazon();
        }
        return instance;
    }

    private Amazon() {
        subscribers = new java.util.ArrayList<>();
    }

    public void subscribe(OrderPlacedSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(OrderPlacedSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void orderPlaced(String order) {
        for (OrderPlacedSubscriber subscriber : subscribers) {
            subscriber.onOrderPlaced(order);
        }
    }
}
