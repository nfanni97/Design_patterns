package decorators;

import components.Component;

public class X extends Decorator {

    public X(Component c) {
        this.c = c;
    }

    @Override
    public void addedBehavior() {
        System.out.print("X");
    }
    
}
