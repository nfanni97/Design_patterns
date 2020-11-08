package visitor;

import java.util.Deque;
import java.util.LinkedList;

import tree.Addition;
import tree.Multiplication;
import tree.Number;

public class CalculatingVisitor implements Visitor {
    //based on invers Polish notation
    private Deque<Integer> operands = new LinkedList<>();

    @Override
    public void visitNumber(Number n) {
        operands.push(n.getValue());
    }

    @Override
    public void printResult() {
        System.out.println("Result of iteration: " + String.valueOf(operands.pop()));
    }

    @Override
    public void visitAddition(Addition a) {
        int first = operands.pop();
        int second = operands.pop();
        operands.push(first+second);
    }

    @Override
    public void visitMultiplication(Multiplication m) {
        int first = operands.pop();
        int second = operands.pop();
        operands.push(first*second);
    }

}
