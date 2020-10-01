package tree;

import visitor.Visitor;

public class Multiplication extends Operator {
    public Multiplication(Node left, Node right) {
        super(left, right);
    }

    @Override
    public String getStringRepresentation() {
        return "*";
    }
}
