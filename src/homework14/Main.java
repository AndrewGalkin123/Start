package homework14;

public class Main {
    public static void main(String[] args) {
        MyStringArrayList arrayList = new MyStringArrayList();
        arrayList.add("cat1");
        arrayList.add("cat2");
        arrayList.add("cat3");
        arrayList.add("cat4");
        arrayList.add("cat5");
        System.out.println(arrayList.toString());
        arrayList.remove(0);
        System.out.println(arrayList.toString());
        arrayList.set(0, "cat6");
        System.out.println(arrayList.get(1));
        System.out.println(arrayList);
    }
}
