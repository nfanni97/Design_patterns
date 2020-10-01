package visitor;

import java.util.Deque;
import java.util.LinkedList;

import tree.Addition;
import tree.Multiplication;
import tree.Number;
import tree.Operator;

public class CalculatingVisitor implements Visitor {
    private Deque<Integer> operands = new LinkedList<>();

    @Override
    public void visitNumber(Number n) {
        operands.push(n.getValue());
    }

    @Override
    public void visitOperator(Operator o) {
        o.postfixIteration(this);
    }

    @Override
    public void printResult() {
        System.out.println("Result of iteration: " + String.valueOf(operands.pop()));
    }

    @Override
    public void processNumber(Number n) {
        visitNumber(n);
    }

    @Override
    public void processAddition(Addition a) {
        int first = operands.pop();
        int second = operands.pop();
        operands.push(first+second);
    }

    @Override
    public void processMultiplication(Multiplication m) {
        int first = operands.pop();
        int second = operands.pop();
        operands.push(first*second);
    }

}
