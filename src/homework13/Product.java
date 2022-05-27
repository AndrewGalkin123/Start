package homework13;

public class Product {
    String name;
    int quantity;
    int weight;
    int price;
    public Product(String name, int quantity, int weight, int price) {
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
