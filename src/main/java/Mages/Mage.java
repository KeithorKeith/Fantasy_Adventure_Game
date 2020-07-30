package Mages;

import Interfaces.IDefend;
import Interfaces.ISpell;

import java.util.ArrayList;

public abstract class Mage {
    ArrayList<ISpell> spells;
    IDefend creature;

    public Mage(IDefend creature) {
        this.creature = creature;
        spells = new ArrayList<ISpell>();
    }

    public IDefend getCreature() {
        return creature;
    }

    public void setCreature(IDefend creature) {
        this.creature = creature;
    }

    public abstract void defend();

}
