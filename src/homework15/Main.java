package homework15;

public class Main {
    public static void main(String[] args) {
        MyIntegerLinkedList list = new MyIntegerLinkedList();
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.add(0);
        System.out.println(list);
        list.set(1,1);
        System.out.println(list);
        System.out.println(list.size());
    }
}
