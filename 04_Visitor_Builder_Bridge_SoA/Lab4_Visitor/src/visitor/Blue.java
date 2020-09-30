package visitor;

public class Blue extends Color {
    public void accept(Visitor v) {
        v.visitBlue(this);
    }

    //not override: operationB
    public void eye() {
        System.out.println("Blue.eye");
    }
}
