import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("Woodwind", "Brass", 1100.00, 1);
    }

    @Test
    public void hasType() {
        assertEquals("Woodwind", saxophone.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(1100.00, saxophone.getBuyingPrice(), 0.00);
    }

    @Test
    public void hasNumberOfReeds() {
        assertEquals(1, saxophone.getNumberOfReeds());
    }
}
