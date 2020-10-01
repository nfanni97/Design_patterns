package tree;

import java.util.function.Consumer;

import exceptions.NotSupportedOperationException;
import visitor.Visitor;

public class Number extends Node {
    private final int value;

    public Number(int v) {
        value = v;
    }

    @Override
    public void addNode(Node left, Node right) throws NotSupportedOperationException {
        throw new NotSupportedOperationException("this is a leaf node");
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public void iterate(Visitor v) {
        v.visitNumber(this);
    }

    @Override
    public void infixIteration(Consumer<? super Node> action) {
        //leaf -> no iteration to do
        action.accept(this);
    }
}
