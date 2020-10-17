package visitor;

public class Red extends Color {
    public void eye()
    {
        System.out.println("Red.eye");
    }

    @Override
    public void accept(Visitor v) {
        v.doRed(this);
    }
}
