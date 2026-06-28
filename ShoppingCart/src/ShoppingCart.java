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
        return items.stream()
                    .mapToDouble(CartItem::price)
                    .sum();
    }

    public int getQuantity(String name) {
        int count = 0;
        for (CartItem item : items) {
            if (item.name().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public void removeItem(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).name().equals(name)) {
                items.remove(i);
                break; 
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("ShoppingCart");
    }
}
