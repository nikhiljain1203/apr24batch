package Models.ProdCons;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Store store;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    public Consumer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {
        //sync
        while(true) {
            //synchronized (store) {
            try {
                consumerSemaphore.acquire();
                if (store.getItems().size() > 0) { // 1 items - T1 Consumer and T2 Consumer
                    store.removeItem();
                }
                producerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //}
        }
    }
}
