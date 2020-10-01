package visitor;

import tree.Addition;
import tree.Multiplication;
import tree.Number;
import tree.Operator;

public interface Visitor {
    public void visitNumber(Number n);
    public void visitAddition(Addition a);
    public void visitMultiplication(Multiplication m);
    public void printResult();
}