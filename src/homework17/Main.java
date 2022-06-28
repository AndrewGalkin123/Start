package homework17;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        MyStack stack = new MyStack();
        stack.push(21);
        stack.push(23);
        stack.push(34);
        stack.push(14);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

    }
}
