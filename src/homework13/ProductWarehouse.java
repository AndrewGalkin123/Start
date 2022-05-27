package homework13;

import java.util.*;

public class ProductWarehouse {
    public static Scanner inputParams = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();
    static String action;
    public static void main(String[] args)  {
        while (true) {
            System.out.println( "Введите действие add, remove,showproducts, exit для выхода");
            action = inputParams.nextLine();
            manageProducts();
        }
    }

    public static void manageProducts() {
        try {
            switch (action.toLowerCase(Locale.ROOT).trim()) {
                case "add":
                    System.out.println("Введите название продукта");
                    String name = inputParams.nextLine();
                    System.out.println("Введите количество продукта");
                    int quantity = inputParams.nextInt();
                    System.out.println("Введите вес продукта");
                    int weight = inputParams.nextInt();
                    System.out.println("Введите цену продукта");
                    int price = inputParams.nextInt();
                    products.add(new Product(name, quantity, weight, price));
                    break;
                case "remove":
                    Iterator<Product> productIterator = products.iterator();
                    System.out.println("Введите название продукта который хотите удалить");
                    String removingName = inputParams.nextLine();
                    if(!productIterator.hasNext()){
                        System.out.println(removingName + " -нету такого продукта");
                    }
                    while (productIterator.hasNext()) {
                        Product nextProduct = productIterator.next();
                        if (nextProduct.name.equals(removingName)) {
                            productIterator.remove();
                            System.out.println(removingName + " был удален");
                            break;
                        }
                    }
                    break;
                case "showproducts":
                    System.out.println(products);
                    break;
                case "exit":
                    System.exit(1);
            }
        } catch (Exception e) {
            System.out.println("Error : " + e + ". Try smth else ");
        }
    }
}
