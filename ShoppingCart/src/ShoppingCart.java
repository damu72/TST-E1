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
        // Deklarativ und sauber:
        return items.stream()
                    .mapToDouble(CartItem::price)
                    .sum();
    }
}
