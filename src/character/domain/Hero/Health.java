package character.domain.Hero;

public class Health extends Statistic{

    public Health(int value) {
        super(value);
    }

    public int getCurrent() {
        return super.getCurrent();
    }

    public int getMax() {
        return super.getMax();
    }

    public void takeDamage(int damage) {
        super.setCurrent(Math.max(0, getCurrent() - damage));
    }

    public void heal(int healingPoints) {
        super.setCurrent(Math.max(getMax(), getCurrent() + healingPoints));
    }
}