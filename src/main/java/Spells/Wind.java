package Spells;

import Interfaces.Player;

public class Wind implements ISpell {

    public void cast(Player victim) {
        int startingHealth = victim.getHealth();
        victim.setHealth(startingHealth - 20);
    }

}
