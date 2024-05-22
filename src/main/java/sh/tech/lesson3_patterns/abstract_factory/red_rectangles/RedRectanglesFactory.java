package sh.tech.lesson3_patterns.abstract_factory.red_rectangles;

import sh.tech.lesson3_patterns.abstract_factory.*;

public class RedRectanglesFactory implements Factory {
    int a,b;

    public RedRectanglesFactory(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Shape getShape() {
        return new Rectangle(a, b);
    }

    @Override
    public Colour getColour() {
        return new Red();
    }
}
