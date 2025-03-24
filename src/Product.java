public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void reduceQuantity(int count) {
        if (count <= quantity) {
            quantity -= count;
         } else {
            System.out.println("Not enough goods in stock!");
        }
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getName() { return name; }

    public double getPrice() { return price; }

    public int getQuantity() {
        return quantity;
    }
}
