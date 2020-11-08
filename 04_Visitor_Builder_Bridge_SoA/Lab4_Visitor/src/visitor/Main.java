package visitor;

public class Main {

    public static void main(String[] args) {
        Color set[] = { new Red(), new Blue(), new Blue(), new Red(), new Red() };
        CallVisitor cav = new CallVisitor();
        CountVisitor cov = new CountVisitor();
        for (Color c : set) {
            c.accept(cav);
            c.accept(cov);
        }
        cov.reportNum();
    }
}
