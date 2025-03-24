public class Products {
    private String name;
    private double price;
    private int quantity;

    public Products(String name,double price,int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    public void reduceQuantity(int count) {
        if (count <= quantity) {
            quantity -= count;
         } else {
            System.out.println("Not enough goods in stock!");
        }
    }


    public String toString() {
        return name + " - " + quantity + " pcs. (price: " + price + " UAH)";
    }


}
