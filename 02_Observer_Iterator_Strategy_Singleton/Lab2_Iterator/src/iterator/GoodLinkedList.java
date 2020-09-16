package iterator;

public class GoodLinkedList {
    class Node {
        public Node(Integer e, Node prev, Node next2) {
            element = e;
            previous = prev;
            next = next2;
        }
        public Integer element;
        public Node next;
        public Node previous;
    }
    Node head = null;
    Node tail = null;

    void insertBack(int v) {
        Node n = new Node(v, tail, null);
        if (tail == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public GoodLinkedListIterator createIterator() {
        return new GoodLinkedListIterator(this);
    }

}
