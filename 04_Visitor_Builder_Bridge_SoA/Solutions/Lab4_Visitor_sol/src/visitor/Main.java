package visitor;

public class Main {

    public static void main(String[] args) {
        Color set[] =
        { new Red(), new Blue(), new Blue(), new Red(), new Red() };
        PrintingVisitor p = new PrintingVisitor();
        CountingVisitor c = new CountingVisitor();
        for (Color e : set)
        {
            e.accept(p);
            e.accept(c);
        }
        c.report();
    }
}
