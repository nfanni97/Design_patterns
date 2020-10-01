package visitor;

import tree.Addition;
import tree.Multiplication;
import tree.Node;
import tree.Number;
import tree.Operator;

public class PrintingVisitor implements Visitor {
    private String toPrint = "";

    @Override
    public void visitNumber(Number n) {
        toPrint += n.getValue();
    }

    @Override
    public void printResult() {
        System.out.println("Result of iteration: " + toPrint);
    }

    @Override
    public void visitOperator(Operator o) {
        o.infixIteration(this);
    }

    @Override
    public void processNumber(Number n) {
        visitNumber(n);
    }

    @Override
    public void processAddition(Addition a) {
        toPrint += "+";
    }

    @Override
    public void processMultiplication(Multiplication m) {
        toPrint += "*";
    }
}
