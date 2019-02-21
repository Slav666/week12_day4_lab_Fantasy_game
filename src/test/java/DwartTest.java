import Player.Dwart;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwartTest {

    Dwart dwart;

    @Before
    public void before(){
        dwart = new Dwart("Slav",75);
    }

    @Test
    public void canGetName(){
        assertEquals("Slav", dwart.getName());
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(75, dwart.getHealthPoint());
    }
}
