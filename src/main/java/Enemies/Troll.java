package Enemies;

import Interfaces.IDefend;
import Weapons.IWeapon;

public class Troll extends Enemy implements IDefend {

    public Troll(int health, IWeapon weapon) {
        super(health, weapon);
    }

}
