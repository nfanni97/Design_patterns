package interpreter;

public class VariableExp implements BooleanExp{
    private String variableName;

    public VariableExp(String v) {
        variableName = v;
    }

    @Override
    public boolean evaluate(Context c) {
        return c.lookup(variableName);
    }

    @Override
    public BooleanExp replace(String replacee, BooleanExp replacement) {
        if(variableName.equals(replacee)) {
            return replacement;
        } else {
            return this;
        }
    }

    
}