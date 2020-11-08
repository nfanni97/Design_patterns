package visitor;

public class Red extends Color {
    public void accept(Visitor v) {
        v.visitRed(this);
    }

    //not override: operationA
    public void eye() {
        System.out.println("Red.eye");
    }
}
