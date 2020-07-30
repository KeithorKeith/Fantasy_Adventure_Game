package Mages;

import Interfaces.IDefend;
import Interfaces.Player;
import Spells.ISpell;

import java.util.ArrayList;

public abstract class Mage extends Player {
    ArrayList<ISpell> spells;
    IDefend creature;

    public Mage(int health, IDefend creature) {
        super(health);
        this.creature = creature;
        spells = new ArrayList<ISpell>();
    }

    public void addSpell(ISpell spell) {
        spells.add(spell);
    }

    public IDefend getCreature() {
        return creature;
    }

    public void setCreature(IDefend creature) {
        this.creature = creature;
    }

    public abstract void defend();

    public void attack(Player victim) {
        spells.get(0).cast(victim);
    }
}
