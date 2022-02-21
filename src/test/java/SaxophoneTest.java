import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("Woodwind", "Brass", 1100.00, 1500.00, 1);
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
    public void hasSellingPrice() {
        assertEquals(1500.00, saxophone.getSellingPrice(), 0.00);
    }

    @Test
    public void hasNumberOfReeds() {
        assertEquals(1, saxophone.getNumberOfReeds());
    }

    @Test
    public void instrumentMakesSound() {assertEquals("Doo Doo Doo", saxophone.playInstrument());}

    @Test
    public void markUpCalculatedCorrectly() {assertEquals(400.00, saxophone.calculateMarkUp(), 0.00);}
}
