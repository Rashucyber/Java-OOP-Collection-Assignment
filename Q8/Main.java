import java.util.*;

class Product {
    int id;
    String name;
    double price;
    int quantity;

    Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println(
            id + " " + name +
            " Price: " + price +
            " Quantity: " + quantity
        );
    }
}

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Product> cart = new HashMap<>();

        // Add products
        cart.put(101, new Product(101, "Laptop", 50000, 1));
        cart.put(102, new Product(102, "Mouse", 500, 2));
        cart.put(103, new Product(103, "Keyboard", 1000, 1));

        // Update quantity
        cart.get(102).quantity = 5;

        // Remove product
        cart.remove(103);

        // Display products
        System.out.println("Shopping Cart:");

        for (Product p : cart.values()) {
            p.display();
        }

        // Calculate total
        double total = 0;

        for (Product p : cart.values()) {
            total = total + p.price * p.quantity;
        }

        System.out.println("Total Cart Amount: " + total);
    }
}