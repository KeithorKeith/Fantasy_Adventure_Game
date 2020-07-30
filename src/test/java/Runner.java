import Enemies.Orc;
import Enemies.Troll;
import Fighters.Dwarf;
import Interfaces.Cleric;
import Mages.Wizard;
import Spells.Fire;
import Weapons.Axe;
import Weapons.HealingPotion;
import Weapons.Staff;
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
    HealingPotion hp;
    Dwarf dwarf;
    Cleric cleric;
    Staff staff;

    @Before
    public void before() {
        sword = new Sword();
        axe = new Axe();
        staff = new Staff();
        fire = new Fire();
        orc = new Orc(100, sword);
        troll = new Troll(100, axe);
        wizard = new Wizard(troll);
        wizard.addSpell(fire);
        hp = new HealingPotion();
        dwarf = new Dwarf(120, axe);
        cleric = new Cleric(60);
        cleric.addHealingTool(hp);
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

    @Test
    public void dwarfCanAttackOrc() {
        dwarf.attack(orc);
        assertEquals(95, orc.getHealth());
    }

    @Test
    public void clericCanHealWizard() {
        orc.attack(wizard);
        cleric.heal(wizard);
        assertEquals(80, wizard.getHealth());
    }
}
