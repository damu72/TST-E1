import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartTest {
    @Test
    void testEmptyCartHasZeroTotal() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.getTotal(), 0.001);
    }

    @Test
    void testAddItemIncreasesTotal() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 2.50);
        assertEquals(2.50, cart.getTotal(), 0.001);
    }

    @Test
    void testAddMultipleItemsSumsTotal() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 2.00);
        cart.addItem("Banana", 3.50);
        assertEquals(5.50, cart.getTotal(), 0.001);
    }

    @Test
    void testGetQuantityOfItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.00);
        cart.addItem("Apple", 1.00);
        cart.addItem("Banana", 3.00);
        
        assertEquals(2, cart.getQuantity("Apple"));
    }

    @Test
    void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 2.00);
        cart.addItem("Banana", 3.00);
        
        cart.removeItem("Apple");
        
        assertEquals(0, cart.getQuantity("Apple"));
        assertEquals(3.00, cart.getTotal(), 0.001);
    }
}


