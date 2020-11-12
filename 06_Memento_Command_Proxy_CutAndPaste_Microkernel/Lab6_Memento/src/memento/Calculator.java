package memento;

public class Calculator {
    private double val;
    private Caretaker caretaker;

    public Calculator(double initVal) {
        val = initVal;
        caretaker = new Caretaker();
        System.out.println("Initialized calculator with "+val);
        createMemento();
    }

    public void doubleValue() {
        val *= 2;
        System.out.println("Doubled value, it is now "+val);
        createMemento();
    }

    public void halveValue() {
        val /= 2;
        System.out.println("Halved value, it is now "+val);
        createMemento();
    }

    private void createMemento() {
        Memento m = new Memento();
        m.setState(val);
        caretaker.addToHistory(m);
    }

    public void undo() {
        Memento m = caretaker.retrieveHistory();
        val = m.getState();
        System.out.println("Undid last operation, value is now "+val);
    }
}
