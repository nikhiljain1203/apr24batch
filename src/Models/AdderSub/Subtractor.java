package Models.AdderSub;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Value x;
    Lock lock;

    public Subtractor(Value x, Lock lock) {
        this.x = x;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        sub();
        return null;
    }

    private void sub() {
        for (int i = 0; i < 100000; i++) {
            //lock.lock();
            synchronized (x) {
                x.setX(x.getX() - 1);
                System.out.println("Sub Value = " + x.getX());
            }
            //lock.unlock();
        }
    }
}
