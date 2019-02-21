import Player.Barbarian;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){barbarian = new Barbarian("Neo",55);
    }

    @Test
    public void canGetName(){
        assertEquals("Neo", barbarian.getName());
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(55, barbarian.getHealthPoint());
    }
}
