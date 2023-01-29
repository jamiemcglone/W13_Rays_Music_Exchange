import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        ArrayList<String> pickups = new ArrayList<>();
        pickups.add("Single coil");
        pickups.add("Single coil");
        pickups.add("Single coil");
        guitar = new Guitar(6, pickups, "Fender","wood", 800, 1450 );
    }

    @Test
    public void canPlayGuitar(){
        assertEquals("Di di do I have strings", guitar.playInstrument());
    }

    @Test
    public void canGetNumOfPickups(){
        assertEquals(3, guitar.getNumOfPickups());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(650, guitar.calculateMarkUp(), 0.0);
    }

    @Test
    public void canGetBrand(){
        assertEquals("Fender", guitar.getBrand());
    }
}
