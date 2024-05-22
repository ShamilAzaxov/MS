package sh.tech.lesson2_solid.liskow_substitution.broken_1;

public class Square implements Shape{

    @Override
    public double areaSquare(int a) {
        return Math.sqrt(a);
    }

    @Override
    public double areaRectangle(int a, int b) {
        throw new RuntimeException();
    }
}
