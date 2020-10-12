package abstractFactory;

public class SimpleFactory implements AbstractFactory {

    @Override
    public Shape CreateCorneredObject() {
        return new Square();
    }

    @Override
    public Shape CreateCircularObject() {
        return new Circle();
    }
    
}
