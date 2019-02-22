import Enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Target;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void before(){troll = new Troll(100, 5);

    }

    @Test
    public void canGetName(){
        assertEquals(100, troll.getHealthPoint());
    }

    @Test
    public void canAttackWithDamageValue() {
        assertEquals(10, troll.getDamageValue());

    }

}
