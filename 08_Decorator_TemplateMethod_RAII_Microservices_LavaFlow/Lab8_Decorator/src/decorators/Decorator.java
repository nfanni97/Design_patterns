package decorators;

import components.Component;

public abstract class Decorator extends Component {
    protected Component c;

    @Override
    public void doIt() {
        c.doIt();
        addedBehavior();
    }

    public abstract void addedBehavior();
}
