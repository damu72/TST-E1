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
        double total = 0.0;
        for (CartItem item : items) {
            total += item.price();
        }
        return total;
    }
}
