import instruments.Piano;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Percussion", "Wood", 3000.00, 2);
    }

    @Test
    public void hasType() {
        assertEquals("Percussion", piano.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(3000.00, piano.getBuyingPrice(), 0.00);
    }

    @Test
    public void hasNumberOfPedals() {
        assertEquals(2, piano.getNumberOfPedals());
    }
}
