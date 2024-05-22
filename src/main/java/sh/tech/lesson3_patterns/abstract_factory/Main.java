package sh.tech.lesson3_patterns.abstract_factory;

import sh.tech.lesson3_patterns.abstract_factory.red_squares.RedSquaresFactory;
import sh.tech.lesson3_patterns.abstract_factory.blue_circles.BlueCirclesFactory;
import sh.tech.lesson3_patterns.abstract_factory.red_rectangles.RedRectanglesFactory;

public class Main {
    public static void main(String[] args) {
        var factory = createForms(Form.RED_RECTANGLES, 4, 5);
        var shape = factory.getShape();
        var colour = factory.getColour();
        shape.calculateArea();
        colour.paint();
    }

    private static Factory createForms(Form form, int ... side){
        return switch (form){
            case BLUE_CIRCLES -> new BlueCirclesFactory(side[0]);
            case RED_SQUARES -> new RedSquaresFactory(side[0]);
            case RED_RECTANGLES -> new RedRectanglesFactory(side[0], side[1]);
        };
    }
}