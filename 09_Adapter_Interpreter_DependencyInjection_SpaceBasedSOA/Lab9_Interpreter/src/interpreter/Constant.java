package interpreter;

public class Constant implements BooleanExp {
    private boolean value;

    public Constant(boolean v) {
        value = v;
    }

    @Override
    public boolean evaluate(Context c) {
        return value;
    }

    @Override
    public BooleanExp replace(String replacee, BooleanExp replacement) {
        //no replacement needed
        return this;
    }
    
}
