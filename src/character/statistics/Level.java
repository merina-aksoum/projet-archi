package character.statistics;

public class Level extends Statistic {
    public Level(int value) {
        super(Math.min(5, Math.max(1, value)));
        super.setMax(5);
    }

    public int getValue() {
        return super.getValue();
    }

    public int getMax() {
        return super.getMax();
    }
}
