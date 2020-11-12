import memento.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(2.3);
        c.doubleValue();
        c.doubleValue();
        c.doubleValue();
        c.halveValue();
        c.doubleValue();
        c.undo();
        c.halveValue();
    }
}
