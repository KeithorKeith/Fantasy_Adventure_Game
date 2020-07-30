package Interfaces;

public class Cleric extends Player {
    public IHeal getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(IHeal healingTool) {
        this.healingTool = healingTool;
    }

    private IHeal healingTool;
}
