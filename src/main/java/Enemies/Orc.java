package Enemies;

import Interfaces.IDefend;
import Weapons.IWeapon;

public class Orc extends Enemy {

    public Orc(int health, IWeapon weapon) {
        super(health, weapon);
    }
}
