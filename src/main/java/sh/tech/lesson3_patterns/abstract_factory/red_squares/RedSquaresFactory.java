package sh.tech.lesson3_patterns.abstract_factory.red_squares;

import sh.tech.lesson3_patterns.abstract_factory.*;

public class RedSquaresFactory implements Factory {
    private int a;

    public RedSquaresFactory(int a) {
        this.a = a;
    }

    @Override
    public Shape getShape() {
        return new Square(a);
    }

    @Override
    public Colour getColour() {
        return new Red();
    }

}
