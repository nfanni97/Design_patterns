package memento;

public class Calculator {
    private double val;

    double getValue() {
        return val;
    }

    void setValue(double v) {
        val = v;
    }

    Calculator(double initVal) {
        val = initVal;
    }

    Memento createMemento() {
        Memento m = new Memento();
        m.setState(val);
        return m;
    }

    void setMemento(Memento m) {
        val = m.getState();
    }
}
