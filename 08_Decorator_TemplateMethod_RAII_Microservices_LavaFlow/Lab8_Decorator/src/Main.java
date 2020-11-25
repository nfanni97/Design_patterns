import components.*;
import decorators.*;

public class Main {
    public static void main(String[] args) {
        Component[] array2 = {
            new X(new A()),
            new Y(new X(new A())),
            new Z(new Y(new X(new A()))),
            new Y(new A()),
            new Z(new A())
        };
        for(Component c: array2) {
            c.doIt();
            System.out.println();
        }
    }
}
