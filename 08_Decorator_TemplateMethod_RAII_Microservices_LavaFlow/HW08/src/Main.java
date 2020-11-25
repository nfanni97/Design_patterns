package src;

import src.pizza.Pizza;
import src.pizza.bases.*;
import src.pizza.extras.*;

public class Main {
    public static void main(String[] args) {
        Pizza[] pizzas = { new Garlic(new Pineapple(new NewYork(Base.Size.LARGE))),
                new TomatoSauce(new Pineapple(new DeepDish(Base.Size.SMALL))),
                new TomatoSauce(new WhiteSauce(new Neapolitan(Base.Size.LARGE))) };
        for (Pizza p : pizzas) {
            System.out.println(p.getDescription());
            System.out.println(Math.round(p.getPrice() * 100.0) / 100.0);
        }
    }
}
