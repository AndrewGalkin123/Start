package homework17;

import java.util.Arrays;

public class MyStack {
    private int size = 0;
    private int[] stack = new int[size];

    public void push(int newItem) {
        resizeForPush(size + 1);
        stack[size - 1] = newItem;

    }
    public int pop() {
        int obj = stack[size - 1];
        resizeForPop(size - 1);
        return obj;
    }
    private void resizeForPush(int length) {
        int[] newStack = new int[length];
        System.arraycopy(stack, 0, newStack, 0, size);
        size = length;
        stack = newStack;
    }
    private void resizeForPop(int length) {
        int[] newStack = new int[length];
        System.arraycopy(stack, 0, newStack, 0, size - 1);
        size = length;
        stack = newStack;
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
}

