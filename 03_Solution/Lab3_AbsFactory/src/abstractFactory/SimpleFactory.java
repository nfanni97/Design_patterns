package abstractFactory;

public class SimpleFactory extends AbsFactory {
    @Override
    Shape getCircular() {
        return new Circle();
    }

    @Override
    Shape getRectangular() {
        return new Square();
    }
}
