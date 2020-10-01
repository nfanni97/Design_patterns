package visitor;

import tree.Addition;
import tree.Multiplication;
import tree.Number;
import tree.Operator;

public interface Visitor {
    public void visitNumber(Number n);
    public void visitOperator(Operator o);
    public void printResult();
    public void processNumber(Number n);
    public void processAddition(Addition a);
    public void processMultiplication(Multiplication m);
}