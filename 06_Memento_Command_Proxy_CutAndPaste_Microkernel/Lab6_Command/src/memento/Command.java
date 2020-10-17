public abstract class Command {
    protected Calculator receiver;
    protected Caretaker caretaker;
    public Command(Calculator r, Caretaker ct) {
        receiver = r;
        caretaker = ct;
    }
    public abstract execute();
}
