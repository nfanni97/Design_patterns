package src.pizza.extras;

import src.pizza.Pizza;

public abstract class Extra implements Pizza {

    protected Pizza p;

    protected abstract String getExtraDescription();

    protected abstract double getExtraPrice();

    @Override
    public String getDescription() {
        return p.getDescription() + " " + getExtraDescription();
    }

    @Override
    public double getPrice() {
        return getExtraPrice() + p.getPrice();
    }

}
