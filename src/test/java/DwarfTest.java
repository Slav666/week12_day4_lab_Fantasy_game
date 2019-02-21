import Player.Dwarf;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Slav",75, Weapon.CLUB);
    }

    @Test
    public void canGetName(){
        assertEquals("Slav", dwarf.getName());
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(75, dwarf.getHealthPoint());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(Weapon.AXE, dwarf.getWeapon());
    }
}
