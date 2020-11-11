package interpreter;

public interface BooleanExp {
    public boolean evaluate(Context c);
    public BooleanExp replace(String replacee, BooleanExp replacement);//replacee: variable name
}
