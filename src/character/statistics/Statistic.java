package character.statistics;

public abstract class Statistic {
    private int value;
    private int max;

    public Statistic(int value) {
        this.max = value;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}