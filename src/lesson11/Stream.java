package lesson11;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("thread :" + Thread.currentThread().getName());
        List<Thread> threads = new ArrayList<>();
        System.out.println("Before sleep main");
        Thread.sleep(2000);
        System.out.println("After");
        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(printer);
//            thread.start();
            PrinterThread thread = new PrinterThread();
            threads.add(thread);
            thread.start();
        }
        System.out.println("thread :" + Thread.currentThread().getName());
        for (Thread thread: threads) {
            thread.join();
        }
        System.out.println("thread :" + Thread.currentThread().getName());

    }

    public static class Printer implements Runnable {
        private String name;

        public Printer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("thread :" + Thread.currentThread().getName());
            System.out.println("Print message" + name);
        }
    }
    public static class  PrinterThread extends Thread{
        @Override
        public void run() {
            System.out.println("PrinterThread prints message " + Thread.currentThread().getName());
        }
    }
}
