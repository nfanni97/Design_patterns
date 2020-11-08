package src.builder;

public class SpicyBuilder extends Builder {
    private String s, t, d;

    @Override
    public void buildDough() {
        System.out.println("SpicyDough created");
        d = "SpicyDough";
    }

    @Override
    public void buildSauce() {
        System.out.println("SpicySauce created");
        s = "SpicySauce";
    }

    @Override
    public void buildTopping() {
        System.out.println("SpicyTopping created");
        t = "SpicyTopping";
    }

    @Override
    public Pizza getResult() {
        System.out.println("SpicyPizza created");
        return new Pizza(d, s, t);
    }
}
