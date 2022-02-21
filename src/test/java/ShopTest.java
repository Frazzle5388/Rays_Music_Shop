import behaviours.ISell;
import instruments.Guitar;
import instruments.Piano;
import items.Plectrum;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
        ISell item;

        @Before
        public void before() {
            shop = new Shop("Music Shop");
            item = new Piano("Big One", "Wood", 12500.00, 15000.00, 2);
            item = new Guitar("Red One", "Steel", 450.00, 700.00, 7);
            item = new Plectrum("Plastic One", 2.00, 5.00);
        }

        @Test
        public void hasName() {
            assertEquals("Music Shop", shop.getName());
        }

        @Test
        public void stockStartsEmpty() {
            assertEquals(0, shop.stockCount());
        }

        @Test
        public void canAddToStock() {
            shop.addToStock(item);
            assertEquals(1, shop.stockCount());
        }

        @Test
        public void canAddGuitarToStock() {
            item = new Guitar("Blue One", "Wood", 5000.00, 6000.00, 6);
            shop.addToStock(item);
            assertEquals(1, shop.stockCount());
        }

        @Test
        public void canRemoveItemFromStock() {
            shop.addToStock(item);
            shop.removeFromStock(item);
            assertEquals(0, shop.stockCount());
        }
}
