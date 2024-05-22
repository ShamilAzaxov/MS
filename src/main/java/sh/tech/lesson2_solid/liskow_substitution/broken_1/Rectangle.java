package sh.tech.lesson2_solid.liskow_substitution.broken_1;

public class Rectangle implements Shape{

    @Override
    public double areaSquare(int a) {
        throw new RuntimeException();
    }

    @Override
    public double areaRectangle(int a, int b) {
        return 2*(a+b);
    }
}
