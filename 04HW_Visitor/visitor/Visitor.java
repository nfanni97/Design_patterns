package visitor;

import tree.Number;
import tree.Operator;

public interface Visitor {
    public void visitNumber(Number n);
    public void visitOperator(Operator o);
    public void printResult();
}