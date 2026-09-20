package domain.Hero;

public abstract class Statistic {
    private int current;
    private int max;

    public Statistic(int value) {
        this.max = value;
        this.current = value;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}