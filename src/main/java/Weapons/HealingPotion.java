package Weapons;

import Interfaces.IHeal;
import Interfaces.Player;

public class HealingPotion implements IHeal {

    public void heal(Player player) {
        int startingHealth = player.getHealth();
        player.setHealth(startingHealth + 25);
    }
}
