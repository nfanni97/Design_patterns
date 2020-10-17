package memento;

import java.util.Deque;
import java.util.LinkedList;

class Caretaker {
    private Deque<Memento> history;
    private Deque<Memento> redoable;

    Caretaker() {
        history = new LinkedList<>();
        redoable = new LinkedList<>();
    }

    Memento retrieveRedo() {
        history.push(redoable.pop());
        return history.peek();
    }

    void addToHistory(Memento m) {
        history.push(m);
    }

    Memento retrieveHistory() {
        redoable.push(history.pop());
        return history.peek();
    }
}
