package Interfaces;

public class Cleric extends Player {
    public Cleric(int health) {
        super(health);
    }

    public IHeal getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(IHeal healingTool) {
        this.healingTool = healingTool;
    }

    private IHeal healingTool;
}
