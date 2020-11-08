package src.builder;

public class HawaiianBuilder extends Builder {
    private String s, t, d;

    @Override
    public void buildDough() {
        System.out.println("HawaiianDough created");
        d = "HawaiianDough";
    }

    @Override
    public void buildSauce() {
        System.out.println("HawaiianSauce created");
        s = "HawaiianSauce";
    }

    @Override
    public void buildTopping() {
        System.out.println("HawaiianTopping created");
        t = "HawaiianTopping";
    }

    @Override
    public Pizza getResult() {
        System.out.println("HawaiianPizaa created");
        return new Pizza(d, s, t);
    }

}
