public class HalveCommand extends Command {
    @Override
    public execute() {
        receiver.setValue(receiver.getValue()/2);
        caretaker.addToHistory(receiver.createMemento());
        System.out.println("Halved value, it is now "+receiver.getValue());
    }
}
