package src.builder;

public class Waiter {
    public void construct(Builder b) {
        b.buildDough();
        b.buildSauce();
        b.buildTopping();
    }
}
