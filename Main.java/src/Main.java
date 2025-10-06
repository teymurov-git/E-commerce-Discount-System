import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Iphone 15 Pro", 200.31, "Iphone"));

        for (Product p : products){
            System.out.println(p);
        }
    }
}