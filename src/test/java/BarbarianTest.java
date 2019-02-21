import Player.Barbarian;

import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){barbarian = new Barbarian("Neo",55, Weapon.SWORD);
    }

    @Test
    public void canGetName(){
        assertEquals("Neo", barbarian.getName());
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(55, barbarian.getHealthPoint());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(Weapon.AXE, barbarian.getWeapon());
    }
}
