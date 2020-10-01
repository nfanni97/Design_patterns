package tree;

import java.util.function.Consumer;

import exceptions.NotSupportedOperationException;
import visitor.Visitor;

public class Number extends Node {
    private final int value;

    public Number(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void addNode(Node left, Node right) throws NotSupportedOperationException {
        throw new NotSupportedOperationException("this is a leaf node");
    }

    @Override
    public void iterate(Visitor v) {
        v.visitNumber(this);
    }

    @Override
    public void infixIteration(Visitor v) {
        //leaf -> no iteration to do
        v.processNumber(this);
    }

    @Override
    public void postfixIteration(Visitor v) {
        //leaf -> no iteration to do
        v.processNumber(this);
    }
}
