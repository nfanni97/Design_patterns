package src.pizza.extras;

import src.pizza.Pizza;

public class TomatoSauce extends Extra {

    public TomatoSauce(Pizza p) {
        this.p = p;
    }

    @Override
    protected String getExtraDescription() {
        return "tomatoSauce";
    }

    @Override
    protected double getExtraPrice() {
        return .5;
    }
    
}
