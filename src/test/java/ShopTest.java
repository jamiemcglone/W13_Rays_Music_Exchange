import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    Piano piano2;

    @Before
    public void before(){
        shop = new Shop("Rays Music Exchange");
        piano = new Piano(88, "Grand", "Steinway", "wood", 6000.00, 8000.00);
        piano2 = new Piano(72, "Upright", "Yamaha", "wood", 2000.00, 3500.00);
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddInstrumentToStock(){
        shop.addToStock(piano);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(piano);
        shop.removeFromStock(piano);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canCalculateTotalProfit() {
        shop.addToStock(piano);
        shop.addToStock(piano2);
        assertEquals(3500.00, shop.calculateTotalProfit(), 0.0);
    }
}
