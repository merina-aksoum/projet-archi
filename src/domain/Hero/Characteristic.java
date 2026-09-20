package domain.Hero;

public class Characteristic {
    private int baseValue;
    private int bonusValue;
    private String name;

    public Characteristic(int value, String name) {
        int min = 3;
        int max = 18;
        this.baseValue = Math.min(max, Math.max(value, min));
        this.name = name;
    }
    public int getModifier() {
        return (baseValue - 10) / 2;
    }

    public void addBonus(int bonus) {
    }

    public int getBaseValue() {
        return baseValue;
    }


    public String getName() {
        return name;
    }
}