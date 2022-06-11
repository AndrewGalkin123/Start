package lesson12;

import java.time.LocalDateTime;
import java.util.concurrent.*;

public class Multithreading {
    public static void main(String[] args) throws ExecutionException,InterruptedException,TimeoutException{
        ExecutorService executorService = Executors.newFixedThreadPool(2);

       // Callable<LocalDateTime> callable = new FutureTest.CurrentDataTime();
       // Future<LocalDateTime> future = executorService.submit(callable);

       // Future<LocalDateTime> future1 = executorService.submit(new FutureTest.CurrentDataTime());

        //System.out.println(future.get());
        //System.out.println(future1.get());
    }
}
