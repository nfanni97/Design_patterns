package memento;

public class DoubleCommand extends Command {

    @Override
    public execute() {
        receiver.setValue(receiver.getValue()*2);
        caretaker.addToHistory(receiver.createMemento());
        System.out.prinitln("Doubled value, it is now "+receiver.getValue());
    }
}
