package Fighters;

import Interfaces.Player;
import Weapons.IWeapon;

public class Dwarf extends Fighter {

    public Dwarf(int health, IWeapon weapon) {
        super(health, weapon);
    }

    public void attack(Player victim) {
        int startingHealth = victim.getHealth();
        victim.setHealth(startingHealth - 5);
    }
}

