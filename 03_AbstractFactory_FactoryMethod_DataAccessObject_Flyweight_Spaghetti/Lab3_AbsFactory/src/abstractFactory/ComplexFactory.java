package abstractFactory;

public class ComplexFactory implements AbstractFactory {

    @Override
    public Shape CreateCorneredObject() {
        return new Rectangle();
    }

    @Override
    public Shape CreateCircularObject() {
        return new Ellipse();
    }
    
}
