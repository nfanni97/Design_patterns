package visitor;

public class CallVisitor implements Visitor {

    @Override
    public void visitBlue(Blue b) {
        b.eye();
    }

    @Override
    public void visitRed(Red r) {
        r.eye();
    }
    
}
