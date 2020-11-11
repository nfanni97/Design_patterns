package interpreter;

public class AndExp implements BooleanExp {
    private BooleanExp exp1, exp2;

    public AndExp(BooleanExp e1, BooleanExp e2) {
        exp1 = e1;
        exp2 = e2;
    }

    @Override
    public boolean evaluate(Context c) {
        return exp1.evaluate(c) && exp2.evaluate(c);
    }

    @Override
    public BooleanExp replace(String replacee, BooleanExp replacement) {
        return new AndExp(exp1.replace(replacee, replacement), exp2.replace(replacee, replacement));
    }
    
}
