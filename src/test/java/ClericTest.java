import Player.Cleric;
import Weapons.Heals;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before(){ cleric = new Cleric("Pope", 100, Heals.HERBS);}

    @Test
    public void canGetName(){ assertEquals ("Pope", cleric.getName());
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(100, cleric.getHealthPoint());
    }

    @Test
    public void canGetHeals(){
        assertEquals(Heals.HERBS, cleric.getHeals());
    }


}
