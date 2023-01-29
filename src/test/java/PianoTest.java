import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano(88, "Grand", "Steinway", "wood", 6000.00, 8000.00);
    }

    @Test
    public void playInstrument() {
        assertEquals("Ding ding I have keys", piano.playInstrument());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(2000, piano.calculateMarkUp(), 0.0);
    }
}