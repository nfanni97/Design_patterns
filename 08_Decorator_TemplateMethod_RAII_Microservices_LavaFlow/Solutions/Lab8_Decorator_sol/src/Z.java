public class Z extends Decorator {
    public Z(Component c) {
        super(c);
    }
    @Override
    public void doIt() {
        component.doIt();
        System.out.print('Z');
    }
}
