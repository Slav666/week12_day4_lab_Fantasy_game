import Player.Knight;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;


    @Before
    public void before(){knight  = new Knight ("Raul",65, Weapon.AXE);
    }

    @Test

    public void canGetName(){
        assertEquals("Raul", knight.getName());
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(65, knight.getHealthPoint());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(Weapon.AXE, knight.getWeapon());
    }
//    @Test
//    public void cnaMakeAttack(){
//
//        assertEquals(45,knight.makeAttack());
//    }
}
