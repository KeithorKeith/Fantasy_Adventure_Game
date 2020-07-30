package Interfaces;

import java.util.ArrayList;

public class Cleric extends Player {
    private ArrayList<IHeal> healingTools;

    public Cleric(int health) {
        super(health);
        healingTools = new ArrayList<IHeal>();
    }

    public void addHealingTool(IHeal item) {
        healingTools.add(item);
    }
}