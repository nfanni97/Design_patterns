public abstract class Decorator implements Component {
    Component component;
    public Decorator(Component c) {
        component = c;
    }
}
