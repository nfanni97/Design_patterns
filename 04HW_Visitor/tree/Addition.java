package tree;

import visitor.Visitor;

public class Addition extends Operator {
    public Addition(Node left, Node right) {
        super(left, right);
    }

    @Override
    public void infixIteration(Visitor v) {
        children.get(Node.direction.LEFT).infixIteration(v);
        v.processAddition(this);
        children.get(Node.direction.RIGHT).infixIteration(v);
    }

    @Override
    public void postfixIteration(Visitor v) {
        children.get(Node.direction.LEFT).postfixIteration(v);
        children.get(Node.direction.RIGHT).postfixIteration(v);
        v.processAddition(this);
    }
}
