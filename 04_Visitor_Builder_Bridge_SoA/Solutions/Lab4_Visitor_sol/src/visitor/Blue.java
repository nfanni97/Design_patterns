package visitor;

public class Blue extends Color {

    public void eye()
    {
        System.out.println("Blue.eye");
    }

    @Override
    public void accept(Visitor v) {
        v.doBlue(this);
    }
}
