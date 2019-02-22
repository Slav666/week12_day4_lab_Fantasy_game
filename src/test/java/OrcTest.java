import Enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;


    @Before
    public void before() {
        orc = new Orc(100, 10);

    }

    @Test
    public void canGetHealthPoint() {
        assertEquals(100, orc.getHealthPoint());
    }

    @Test
    public void canAttackWithDamageValue() {
        assertEquals(10, orc.getDamageValue());

    }


}

