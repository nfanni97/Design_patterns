package visitor;

import tree.Number;
import tree.Operator;

public class PrintingVisitor implements Visitor {
    private String toPrint = "";

    @Override
    public void visitNumber(Number n) {
        toPrint += n.toString();
        System.out.println("Added to print: "+n.toString());
    }

    @Override
    public void printResult() {
        System.out.println("Result of iteration: " + toPrint);
    }

    @Override
    public void visitOperator(Operator o) {
    }

}
