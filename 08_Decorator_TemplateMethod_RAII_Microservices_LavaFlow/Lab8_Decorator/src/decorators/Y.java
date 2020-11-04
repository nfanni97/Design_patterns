package decorators;

import components.Component;

public class Y extends Decorator {

    public Y(Component c) {
        this.c = c;
    }

    @Override
    public void addedBehavior() {
        System.out.print("Y");
    }
    
}
