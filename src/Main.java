import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        store.addProducts(new Products("Bread", 20.4,100));
        store.addProducts(new Products("Milk", 30.10,50));

        store.ShowAllProducts();

        store.buyProduts("Bread", 3);
        store.buyProduts("Milk", 50);

        store.ShowAllProducts();
//
    }
}