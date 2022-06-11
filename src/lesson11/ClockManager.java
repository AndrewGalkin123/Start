package lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClockManager {
    public static boolean IS_CLOCK_RUN = true;
    public static void main(String[] args) throws InterruptedException, IOException {
        Thread thread = new Thread(new Clock());
        thread.start();
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("after start");

        Thread.sleep(5000);
        System.out.println("проснулись");
        System.out.println("оставить ?");
        IS_CLOCK_RUN = Boolean.parseBoolean(reader.readLine());
        if(!IS_CLOCK_RUN){
            thread.interrupt();
        }
    }
    public static class Clock implements Runnable{
        @Override
        public void run() {
            Thread current = Thread.currentThread();
            while (!current.isInterrupted()){
                try{
                    Thread.sleep(2000);
                    System.out.println("Tik");
                }catch (Exception e){
                    System.out.println("часы был выкл во время сна");
                    return;
                }
                System.out.println("Tik");
            }
        }
    }
}
