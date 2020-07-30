package Mages;

import Interfaces.IDefend;
import Interfaces.ISpell;

import java.util.ArrayList;

public abstract class Mage {
    ArrayList<ISpell> spells;
    IDefend creature;

    public IDefend getCreature() {
        return creature;
    }

    public void setCreature(IDefend creature) {
        this.creature = creature;
    }
}
