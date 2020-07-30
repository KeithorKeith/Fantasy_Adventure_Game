import Enemies.Orc;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Runner {
    Sword sword;
    Orc orc;

    @Before
    public void before() {
        sword = new Sword();
        orc = new Orc(100, sword);
    }

    @Test
    public void testAttackSelf() {
        orc.attack(orc);
        assertEquals(70, orc.getHealth());
    }
}
