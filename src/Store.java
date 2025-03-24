import java.util.ArrayList;

public class Store {
    private final ArrayList<Products> products = new ArrayList<>();

    public void addProducts(Products product) {
        products.add(product);
    }

    public void buyProducts(String name, int count) {
        for(Products product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.reduceQuantity(count);
                return;
            }
        }
        System.out.println("Product not found!");
    }

    public void showAllProducts() {
        System.out.println("\n List of products:");
        for (Products product : products) {
            System.out.println(product);
        }
    }


}
