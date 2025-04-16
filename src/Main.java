import Models.AdderSub.Adder;
import Models.AdderSub.Subtractor;
import Models.AdderSub.Value;
import Models.Inheritance.C;
import Models.Interfaces.Stack;
import Models.Multithreading.FibonacciNumber;
import Models.Multithreading.HelloWorldPrinter;
import Models.Multithreading.NumberPrinter;
import Models.Polymorphism.Animal;
import Models.Polymorphism.Dog;
import Models.Student;

import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Task: Print Numbers from 1 to 100, Each in a Separate Thread
// C1 : -----T1
// C2 : --T2
// Threadpool - pool of threads from where a free thread will pick up task from queue
// 1 Fixed - Number of thread fixed
// 2 Cached - no fixed number - if available use or create new

/*
int fib(int n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);
}
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        System.out.println("Main is executing in " + Thread.currentThread().getName());
//        Thread t = new Thread(new HelloWorldPrinter());
//
//        t.start();
//
////        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
////        helloWorldPrinter.run();
////        System.out.println("Main is executing in " + Thread.currentThread().getName());
////
////        ExecutorService executorService = Executors.newFixedThreadPool(5);
////        for(int i = 1 ; i <=100; i++) {
////            executorService.execute(new NumberPrinter(i));
////        }
//        ExecutorService executorService = Executors.newCachedThreadPool();
//
//        Future<Integer> ansFuture = executorService.submit(new FibonacciNumber(10));
//        System.out.println(ansFuture.get());

        //int x = 0;
        Value x = new Value(0);
        Lock lock = new ReentrantLock();
        Adder added = new Adder(x, lock);
        Subtractor subtractor = new Subtractor(x, lock);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Void> addFuture = executorService.submit(added);
        Future<Void> subFuture = executorService.submit(subtractor);

        addFuture.get();
        subFuture.get();

        System.out.println(x.getX());

    }
}