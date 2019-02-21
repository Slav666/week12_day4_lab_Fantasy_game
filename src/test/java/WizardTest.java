import Player.Wizard;
import Weapons.Defend;
import Weapons.Spells;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;


    @Before
    public void before(){wizard = new Wizard("Dell", 70, Spells.FIREBALL, Defend.OGRE);
    }
    @Test
    public void canGetName(){
        assertEquals("Dell", wizard.getName());
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(70, wizard.getHealthPoint());
    }
    @Test
    public void canGetSpell(){
        assertEquals(Spells.FIREBALL, wizard.getSpell());
    }
    @Test
    public void canGetDefend(){
        assertEquals(Defend.OGRE, wizard.getDefend());
    }
}
