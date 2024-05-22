package sh.tech.lesson3_patterns.abstract_factory.blue_circles;
import sh.tech.lesson3_patterns.abstract_factory.*;

public class BlueCirclesFactory implements Factory {
    private int r;

    public BlueCirclesFactory(int r) {
        this.r = r;
    }

    @Override
    public Shape getShape() {
        return new Circle(r);
    }

    @Override
    public Colour getColour() {
        return new Blue();
    }
}