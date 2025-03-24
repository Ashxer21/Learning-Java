import java.util.ArrayList;

public class Store {
    private final ArrayList<Product> products = new ArrayList<>();

    public void addProducts(Product product) {
        products.add(product);
    }

    public void buyProducts(String name, int count) {
        for(Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.reduceQuantity(count);
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void showAllProducts() {
        System.out.println("\n List of products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }


}
