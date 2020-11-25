package src.pizza.extras;

import src.pizza.Pizza;

public class Pineapple extends Extra {

    public Pineapple(Pizza p) {
        this.p = p;
    }

    @Override
    protected String getExtraDescription() {
        return "pineapple";
    }

    @Override
    protected double getExtraPrice() {
        return 1.99;
    }
    
}
