package Weapons;

import Interfaces.Player;

public class Sword implements IWeapon {

    public void attack(Player victim) {
        int startingHealth = victim.getHealth();
        victim.setHealth(startingHealth - 30);
    }
}
