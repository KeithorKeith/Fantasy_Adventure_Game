import Enemies.Orc;
import Enemies.Troll;
import Mages.Wizard;
import Spells.Fire;
import Weapons.Axe;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Runner {
    Sword sword;
    Axe axe;
    Orc orc;
    Troll troll;
    Fire fire;
    Wizard wizard;

    @Before
    public void before() {
        sword = new Sword();
        axe = new Axe();
        fire = new Fire();
        orc = new Orc(100, sword);
        troll = new Troll(100, axe);
        wizard = new Wizard(troll);
        wizard.addSpell(fire);
    }

    @Test
    public void testAttackSelf() {
        orc.attack(orc);
        assertEquals(70, orc.getHealth());
    }

    @Test
    public void wizardCanAttackOrc() {
        wizard.attack(orc);
        assertEquals(80, orc.getHealth());
    }
}
