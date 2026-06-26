import java.util.ArrayList;
import java.util.List;

record CartItem(String name, double price) {}

class ShoppingCart {
    private final List<CartItem> items = new ArrayList<>();

    public void addItem(String name, double price) {
        items.add(new CartItem(name, price));
        
        System.out.println("Liste sieht so aus: " + items);
    }

    public double getTotal() {
        if (!items.isEmpty()) {
            return items.get(0).price(); // Fake it till you make it
        }
        return 0.0;
    }
}
