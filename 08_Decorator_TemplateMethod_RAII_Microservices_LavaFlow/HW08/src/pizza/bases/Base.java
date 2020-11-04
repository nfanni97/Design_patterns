package src.pizza.bases;

import src.pizza.Pizza;

public abstract class Base implements Pizza {
    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    protected Size size;
    protected String name;

    public Base(Size s) {
        size = s;
    }

    @Override
    public String getDescription() {
        return size.name().toLowerCase() + " " + name + " pizza with ingredients:";
    }
}
