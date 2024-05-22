package sh.tech.lesson2_solid.liskow_substitution.correct_1;

public class Square implements Shape {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double area() {
        return Math.sqrt(this.getA());
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
