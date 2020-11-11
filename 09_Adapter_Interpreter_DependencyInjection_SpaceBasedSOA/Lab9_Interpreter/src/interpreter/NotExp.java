package interpreter;

public class NotExp implements BooleanExp {
    private BooleanExp exp;

    public NotExp(BooleanExp e) {
        exp = e;
    }

    @Override
    public boolean evaluate(Context c) {
        return !exp.evaluate(c);
    }

    @Override
    public BooleanExp replace(String replacee, BooleanExp replacement) {
        return new NotExp(exp.replace(replacee, replacement));
    }
    
}
