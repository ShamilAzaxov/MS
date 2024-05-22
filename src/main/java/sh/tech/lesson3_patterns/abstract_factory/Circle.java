package sh.tech.lesson3_patterns.abstract_factory;

public class Circle implements Shape{
    private static final double PI = 3.14;
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void calculateArea() {
        System.out.println(PI*Math.sqrt(r));
    }
}
