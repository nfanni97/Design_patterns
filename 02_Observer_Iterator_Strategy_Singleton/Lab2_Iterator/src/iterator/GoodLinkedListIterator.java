package iterator;

import java.util.Iterator;

public class GoodLinkedListIterator implements Iterator {
    private GoodLinkedList list;
    private GoodLinkedList.Node current;

    public GoodLinkedListIterator(GoodLinkedList list) {
        current = list.head;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return current.next != null;
    }

    @Override
    public Object next() {
        current = current.next;
        return current.element;
    }

    public int get() {
        return current.element;
    }

    public void first() {
        current = list.head;
    }

    public boolean isDone() {
        return current == null;
    }
}
