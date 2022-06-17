package homework15;

import java.util.Arrays;

public class MyIntegerLinkedList {
    private int size;
    private Node first;
    private Node last;
    private class Node {
        int number;
        Node prev;

        public Node(int number, Node prev) {
            this.number = number;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "number=" + number +
                    ", prev=" + prev +
                    '}';
        }
    }
    public MyIntegerLinkedList() {
    }


    private Node node(int index) {
        Node node = last;
        for (int i = size - 1; i > index; i--)
            node = node.prev;
        return node;
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            System.out.println("Error");
            return;
        }
        if (node(index) == last) {
            node(index).prev = null;
            last = node(index - 1);
            return;
        }
        node(index + 1).prev = node(index).prev;
        size--;
    }
    public void set(int num, int index) {
        if (index >= size || index < 0) {
            System.out.println("Error");
            return;
        }
        node(num).number = index;
    }
    public void add(int num) {
        Node lastNumber = last;
        Node newNumber = new Node(num, lastNumber);
        last = newNumber;
        if (size == 0) first = newNumber;
        size++;
    }

    public void add(int index, int num) {
        if (index >= size || index < 0) {
            System.out.println("Error");
            return;
        }
        if (index == size - 1) {
            add(num);
            return;
        }
        if (index == 0) {
            add(num);
            return;
        }
        node(index + 1).prev = new Node(num, node(index));
        size++;
    }

    public int size() {
        return size;
    }
    public int get(int index) {
        if (size == 0) {
            System.out.println("Error");
            return 0;
        }
        if (index >= size || index < 0) {
            System.out.print("Error");
            return 0;
        }
        return node(index).number;
    }
    @Override
    public String toString() {
        int[] result = new int[size];
        int i = size - 1;
        for (Node k = last; k != null; k = k.prev)
            result[i--] = k.number;
        return Arrays.toString(result);
    }
}

