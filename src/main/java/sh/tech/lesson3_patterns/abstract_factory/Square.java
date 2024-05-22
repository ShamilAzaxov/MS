package sh.tech.lesson3_patterns.abstract_factory;

public class Square implements Shape{

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void calculateArea() {
        System.out.println(a*a);
    }
}
