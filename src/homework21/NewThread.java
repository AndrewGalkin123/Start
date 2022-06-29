package homework21;

public class NewThread implements Runnable {
    Thread thread;

    NewThread() {
        thread = new Thread(this, "Demo Thread");
        thread.start();

    }


    public void run() {


        System.out.println("smth");
    }
}
