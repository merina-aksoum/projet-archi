package character.statistics;

public class Health extends Statistic{

    public Health(int value) {
        super(value);
    }

    public int getValue() {
        return super.getValue();
    }

    public int getMax() {
        return super.getMax();
    }

    public void takeDamage(int damage) {
        super.setValue(Math.max(0, getValue() - damage));
    }

    public void heal(int healingPoints) {
        super.setValue(Math.max(getMax(), getValue() + healingPoints));
    }
}