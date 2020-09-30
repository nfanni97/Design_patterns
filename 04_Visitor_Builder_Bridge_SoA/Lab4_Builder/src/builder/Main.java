package src.builder;

public class Main {
    public static void main(String[] args) {
        HawaiianBuilder hb = new HawaiianBuilder();
        SpicyBuilder sb = new SpicyBuilder();
        Waiter w = new Waiter();

        w.construct(hb);
        w.construct(sb);

        Pizza hp = hb.getResult();
        Pizza sp = sb.getResult();
    }
}
