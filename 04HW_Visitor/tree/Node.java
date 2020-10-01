package tree;

import exceptions.NotSupportedOperationException;
import visitor.Visitor;

public abstract class Node {
    public enum direction {
        LEFT, RIGHT
    };

    // practically not needed, as non-leaf nodes have to have 2 children (therefore
    // they are given in constructor), otherwise the tree is incorrect
    public abstract void addNode(Node left, Node right) throws NotSupportedOperationException;

    // remove not needed

    public Node getChild(direction d) throws NotSupportedOperationException {
        return null;
    }

    //accept
    public abstract void iterate(Visitor v);
}