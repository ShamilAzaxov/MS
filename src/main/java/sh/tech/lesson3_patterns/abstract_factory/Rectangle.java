package sh.tech.lesson3_patterns.abstract_factory;

public class Rectangle implements Shape{
    int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void calculateArea() {
        System.out.println(a*b);
    }
}
