import Player.Warlock;
import Weapons.Defend;
import Weapons.Spells;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){warlock  = new Warlock ("Raul",65, Spells.FIREBALL, Defend.OGRE);
    }

    @Test
    public void canGetName(){
        assertEquals("Raul", warlock.getName());
    }
    @Test
    public void canGetHealthPoint(){
        assertEquals(65, warlock.getHealthPoint());
    }
    @Test
    public void canGetSpell(){
        assertEquals(Spells.FIREBALL, warlock.getSpell());
    }
    @Test
    public void canGetDefend(){
        assertEquals(Defend.OGRE, warlock.getDefend());
    }
}
