package Interfaces;

import java.util.ArrayList;

public class Cleric extends Player {
    private ArrayList<IHeal> healingTools;

    public Cleric(int health) {
        super(health);
        healingTools = new ArrayList<IHeal>();
    }

    public void attack(Player victim) {
        int startingHealth = victim.getHealth();
        victim.setHealth(startingHealth - 5);
    }

    public void addHealingTool(IHeal item) {
        healingTools.add(item);
    }

    public void heal(Player player) {
        int startingHealth = player.getHealth();
        player.setHealth(startingHealth + 10);
    }
}