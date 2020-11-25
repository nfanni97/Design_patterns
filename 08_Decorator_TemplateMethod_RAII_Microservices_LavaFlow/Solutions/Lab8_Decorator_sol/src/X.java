public class X extends Decorator {
    public X(Component c) {
        super(c);
    }
    @Override
    public void doIt() {
        component.doIt();
        System.out.print('X');
    }
}
