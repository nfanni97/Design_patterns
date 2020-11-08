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
    public void visitAddition(Addition a) {
        toPrint += "+";
    }

    @Override
    public void visitMultiplication(Multiplication m) {
        toPrint += "*";
    }
}
