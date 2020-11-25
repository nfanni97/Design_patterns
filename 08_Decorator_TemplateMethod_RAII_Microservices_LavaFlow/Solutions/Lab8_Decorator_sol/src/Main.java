public class Main {
    public static void main(String[] args) {
        Component[] array = {new X(new A()), new Y(new X(new A())), new Z(new Y(new X(new A())))};
        for (Component a : array) {
            a.doIt();
            System.out.print("  ");
        }
    }
}
