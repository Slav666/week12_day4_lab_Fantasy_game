import Enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

 class OrcTest {

    Orc orc;


     @Before
    public void before(){ orc = new Orc(100);

     }

     @Test
    public void canGetHealthPoint(){
         assertEquals(100, orc.getHealthPoint());
     }

     @Test void canTakeDamage(){

         assertEquals(95, orc.takeDamage());
     }


}
