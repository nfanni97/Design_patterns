package visitor;

import tree.Node;
import tree.Number;
import tree.Operator;

public class PrintingVisitor implements Visitor {
    private String toPrint = "";

    @Override
    public void visitNumber(Number n) {
        toPrint += n.toString();
    }

    @Override
    public void printResult() {
        System.out.println("Result of iteration: " + toPrint);
    }

    @Override
    public void visitOperator(Operator o) {
        o.infixIteration((Node n) -> toPrint += n.toString());
    }

}
