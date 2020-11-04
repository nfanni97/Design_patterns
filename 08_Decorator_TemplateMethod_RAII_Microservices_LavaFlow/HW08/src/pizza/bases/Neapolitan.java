package src.pizza.bases;

public class Neapolitan extends Base {

    public Neapolitan(Size s) {
        super(s);
        name = "Neapolitan";
    }

    @Override
    public String getDescription() {
        return size.name().toLowerCase() + " Neapolitan pizza with ingredients:";
    }

    @Override
    public double getPrice() {
        return 10 + size.ordinal() * 5;
    }

}
