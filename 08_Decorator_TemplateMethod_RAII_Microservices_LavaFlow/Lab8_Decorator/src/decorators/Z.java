package decorators;

import components.Component;

public class Z extends Decorator {

    public Z(Component c) {
        this.c = c;
    }

    @Override
    public void addedBehavior() {
        System.out.print("Z");
    }
    
}
