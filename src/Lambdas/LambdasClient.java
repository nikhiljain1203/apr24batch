package Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdasClient {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("I am a task");
        };

        Thread t = new Thread(task);
        t.start();

        List<Integer> l = new ArrayList<>();
        // mutable
        l.add(11);
        l.add(2);
        l.add(31);
        l.add(14);

        Collections.sort(l, (a, b) -> {
            if (a < b) {
                return 1;
            } else if (a > b) {
                return -1;
            } else {
                return 0;
            }
        });


    }
}
