package homework17;

import java.util.Arrays;

public class MyQueue {
    private int size = 0;
    private String[] queue = new String[size];

    public void add(String elem) {
        resizeForAdd(size + 1);
        queue[size - 1] = elem;
    }
    public String poll() {
        String obj = queue[0];
        resizeForPoll(size - 1);
        return obj;
    }
    private void resizeForPoll(int length) {
        String[] newQueue = new String[length];
        System.arraycopy(queue, 1, newQueue, 0, size - 1);
        size = length;
        queue = newQueue;
    }
    private void resizeForAdd(int length) {
        String[] newQueue = new String[length];
        System.arraycopy(queue, 0, newQueue, 0, size);
        size = length;
        queue = newQueue;
    }
    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
