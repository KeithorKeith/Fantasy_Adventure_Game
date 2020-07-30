package Enemies;

import Interfaces.Player;
import Weapons.IWeapon;

public abstract class Enemy extends Player {
    IWeapon weapon;

    public Enemy (int health, IWeapon weapon) {
        super(health);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Player victim) {
        weapon.attack(victim);
    }
}
