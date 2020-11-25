package src.pizza.extras;

import src.pizza.Pizza;

public class WhiteSauce extends Extra {

    public WhiteSauce(Pizza p) {
        this.p = p;
    }

    @Override
    protected String getExtraDescription() {
        return "whiteSauce";
    }

    @Override
    protected double getExtraPrice() {
        return 1;
    }
    
}
