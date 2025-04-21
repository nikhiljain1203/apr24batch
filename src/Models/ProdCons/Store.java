package Models.ProdCons;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxSize;
    //private List<Object> items;
    private ConcurrentLinkedQueue<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedQueue<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }

    public void setItems(ConcurrentLinkedQueue<Object> items) {
        this.items = items;
    }

    public void addItem(Object item) {
        items.add(item);
        if(items.size() > 10) {
            System.out.println("Producer has added an itme to the store: " + items.size());
        }
    }

    public void removeItem() {
        items.remove(items.size() - 1); // removing items from last
        //System.out.println("Consumer has consume items from the store: " +  items.size());
    }
}
