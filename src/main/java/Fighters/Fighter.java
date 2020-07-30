package Fighters;

import Interfaces.Player;
import Weapons.IWeapon;

public abstract class Fighter extends Player {
    IWeapon weapon;

    public Fighter(int health, IWeapon weapon) {
        super(health);
        this.weapon = weapon;
    }


}
