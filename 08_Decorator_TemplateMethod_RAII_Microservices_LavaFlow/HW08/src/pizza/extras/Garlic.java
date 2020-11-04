package src.pizza.extras;

import src.pizza.Pizza;

public class Garlic extends Extra {
    public Garlic(Pizza p) {
        this.p = p;
    }

    @Override
    protected String getExtraDescription() {
        return "garlic";
    }

    @Override
    protected double getExtraPrice() {
        return 1.3;
    }
}
