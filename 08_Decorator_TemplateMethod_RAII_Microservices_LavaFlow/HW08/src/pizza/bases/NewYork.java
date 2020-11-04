package src.pizza.bases;

public class NewYork extends Base {

    public NewYork(Size s) {
        super(s);
        name = "New York";
    }

    @Override
    public double getPrice() {
        return 13 + size.ordinal() * 6 + .99;
    }

}
