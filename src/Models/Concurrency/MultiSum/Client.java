package Models.Concurrency.MultiSum;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int n = 1_000_000;
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i<n; i++) {
            arr.add(i%100);
        }

        System.out.println("Arr " + arr.toString());

        int numThreads = Runtime.getRuntime().availableProcessors();
        int chunksize = n/numThreads;

        System.out.println("Chunk " + chunksize + " threads " + numThreads);
        ExecutorService es = Executors.newFixedThreadPool(numThreads);

        List<Future<Long>> sumFutures = new ArrayList<>();
        for(int i = 0; i < numThreads; i++) {
            SumMultiThreadCallable tempTask =
                    new SumMultiThreadCallable(arr, i*chunksize,  (i+1)*chunksize);
            Future<Long> tempFuture = es.submit(tempTask);
            sumFutures.add(tempFuture);
        }

        Long sum = 0L;
        for(Future<Long> future : sumFutures) {
            sum += future.get();
        }

        System.out.println("Sum of Array : " + sum);
    }
}
