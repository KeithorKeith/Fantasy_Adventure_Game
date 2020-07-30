package Fighters;

import Interfaces.Player;
import Weapons.IWeapon;

public class Barbarian extends Fighter{

    public Barbarian(int health, IWeapon weapon) {
        super(health, weapon);
    }

    public void attack(Player victim) {
        int startingHealth = victim.getHealth();
        victim.setHealth(startingHealth - 5);
    }
}
