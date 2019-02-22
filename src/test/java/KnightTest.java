import Player.Knight;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static Weapons.Weapon.AXE;
import static Weapons.Weapon.SWORD;
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

    @Test
    public void canShowTheDamageValueClub(){
        assertEquals(45, knight.makeAttack());
    }

    @Test
    public void canChangeWeaponToSWORD(){
        knight.setWeapon(SWORD);
        assertEquals(Weapon.SWORD, knight.getWeapon());
    }
    @Test
    public void FighterCanBeAttacked(){
        knight.isAttacked(20);
        assertEquals(45, knight.getHealthPoint());
    }

    @Test
    public void FighterCanBeHealed(){
        knight.isAttacked(20);
        assertEquals(45, knight.getHealthPoint());
        knight.isHealed(10);
        assertEquals(55, knight.getHealthPoint());

    }
}
