package tree;

import visitor.Visitor;

public class Addition extends Operator {
    public Addition(Node left, Node right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "+";
    }
}
