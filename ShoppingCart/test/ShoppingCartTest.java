import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartTest {
    @Test
    void testEmptyCartHasZeroTotal() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.getTotal(), 0.001);
    }
}
