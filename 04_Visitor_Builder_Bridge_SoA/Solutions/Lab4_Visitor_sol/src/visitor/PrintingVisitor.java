package visitor;

public class PrintingVisitor implements Visitor{
    @Override
    public void doRed(Red r) {
        r.eye();
    }

    @Override
    public void doBlue(Blue r) {
        r.eye();
    }
}
