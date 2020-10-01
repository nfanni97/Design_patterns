package tree;

import java.util.HashMap;
import java.util.function.Consumer;

import exceptions.NotSupportedOperationException;
import visitor.Visitor;

public abstract class Operator extends Node {
    protected HashMap<Node.direction, Node> children = new HashMap<>();

    public Operator(Node left, Node right) {
        children.put(Node.direction.LEFT, left);
        children.put(Node.direction.RIGHT, right);
    }

    @Override
    public void addNode(Node left, Node right) throws NotSupportedOperationException {
        throw new NotSupportedOperationException("the operator already has both of its operands");
    }

    @Override
    public Node getChild(Node.direction d) throws NotSupportedOperationException {
        return children.get(d);
    }

    @Override
    public void iterate(Visitor v) {
        v.visitOperator(this);
    }

    @Override
    public void infixIteration(Consumer<? super Node> action) {
        children.get(Node.direction.LEFT).infixIteration(action);
        action.accept(this);
        children.get(Node.direction.RIGHT).infixIteration(action);
    }
}
