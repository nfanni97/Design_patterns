package memento;

import java.util.Deque;
import java.util.LinkedList;

class Caretaker {
    private Deque<Memento> history;

    Caretaker() {
        history = new LinkedList<>();
    }

    void addToHistory(Memento m) {
        history.push(m);
    }

    Memento retrieveHistory() {
        history.pop();
        return history.peek();
    }
}
