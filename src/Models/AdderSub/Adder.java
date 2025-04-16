package Models.AdderSub;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Value x;
    Lock lock;

    public Adder(Value x, Lock lock) {
        this.x = x;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        add();
        return null;
    }

    private void add() {
        for (int i = 0; i < 100000; i++) {
            //lock.lock();
            synchronized (x) {
                x.setX(x.getX() + 1);
                System.out.println("Added Value = " + x.getX());
            }
            //lock.unlock();
        }
    }
}
