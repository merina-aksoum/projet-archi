package character.statistics.abilityScores;

public class AbilityScore {
    private int value;
    private int modifier;
    private String name;

    public AbilityScore(int value, String name) {
        int min = 3;
        int max = 18;
        this.value = Math.min(max, Math.max(value, min));
        this.modifier = (value - 10) / 2;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public int getModifier() {
        return modifier;
    }

    public String getName() {
        return name;
    }
}