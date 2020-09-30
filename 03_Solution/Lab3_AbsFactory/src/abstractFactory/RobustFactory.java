package abstractFactory;

public class RobustFactory extends AbsFactory {
    @Override
    Shape getCircular() {
        return new Ellipse();
    }

    @Override
    Shape getRectangular() {
        return new Rectangle();
    }
}
