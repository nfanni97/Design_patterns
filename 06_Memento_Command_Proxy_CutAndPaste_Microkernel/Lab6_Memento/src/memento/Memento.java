package memento;

public class Memento {
    private double val;

    public Memento() {
    }

    double getState() {
        return val;
    }

    public void setState(double v) {
        val = v;
    }
}
