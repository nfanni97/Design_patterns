public class Y extends Decorator {
    public Y(Component c) {
        super(c);
    }
    @Override
    public void doIt() {
        component.doIt();
        System.out.print('Y');
    }
}
