package Models.Multithreading;

public class HelloWorldPrinter implements Runnable {

    public void print() {
        System.out.println("Hello World");
        System.out.println("Thread is executing in " + Thread.currentThread().getName());

    }

    @Override
    public void run() {
        print();
    }
}
