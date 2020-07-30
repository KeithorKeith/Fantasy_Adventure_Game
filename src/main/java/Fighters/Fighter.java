package Fighters;

import Interfaces.Player;
import Weapons.IWeapon;

public abstract class Fighter extends Player {

    public Fighter(int health, IWeapon weapon) {
        super(health);
    }


}
