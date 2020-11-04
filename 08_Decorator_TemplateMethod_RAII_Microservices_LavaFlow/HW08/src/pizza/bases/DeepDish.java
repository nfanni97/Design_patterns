package src.pizza.bases;

public class DeepDish extends Base {

    public DeepDish(Size s) {
        super(s);
        name = "Deep dish";
    }

    @Override
    public double getPrice() {
        return 8 + size.ordinal() * 4;
    }

}
