import instruments.Guitar;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("String", "Wood", 500.00, 5);
    }

    @Test
    public void hasType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(500.00, guitar.getBuyingPrice(), 0.00);
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(5, guitar.getNumberOfStrings());
    }
}
