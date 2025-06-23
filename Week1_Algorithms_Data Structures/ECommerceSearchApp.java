import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Product {
    private int id;
    private String name;
    private String description;

    public Product(int id, String name, String description) {
        this.id = id;
        this.name = name.toLowerCase();
        this.description = description.toLowerCase();
    }

    public boolean matches(String keyword) {
        keyword = keyword.toLowerCase();
        return name.contains(keyword) || description.contains(keyword);
    }

    @Override
    public String toString() {
        return "Product ID: " + id + "\nName: " + name + "\nDescription: " + description + "\n";
    }
}


public class ECommerceSearchApp {

    private static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        seedData();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a keyword to search for products:");
        String keyword = scanner.nextLine();

        List<Product> results = searchProducts(keyword);

        if (results.isEmpty()) {
            System.out.println("No products found matching the keyword: " + keyword);
        } else {
            System.out.println("Search Results:");
            for (Product p : results) {
                System.out.println(p);
            }
        }
    }

    
    private static void seedData() {
        products.add(new Product(1, "Laptop", "High-performance gaming laptop"));
        products.add(new Product(2, "Smartphone", "Latest Android phone with AMOLED display"));
        products.add(new Product(3, "Headphones", "Noise-cancelling over-ear headphones"));
        products.add(new Product(4, "Smartwatch", "Fitness tracker and smart features"));
        products.add(new Product(5, "Camera", "DSLR camera with 24MP resolution"));
    }

   
    private static List<Product> searchProducts(String keyword) {
        List<Product> matched = new ArrayList<>();
        for (Product p : products) {
            if (p.matches(keyword)) {
                matched.add(p);
            }
        }
        return matched;
    }
}
