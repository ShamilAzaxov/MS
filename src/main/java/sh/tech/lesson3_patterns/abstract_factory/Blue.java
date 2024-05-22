package sh.tech.lesson3_patterns.abstract_factory;

public class Blue implements Colour{

    public Blue() {
    }

    @Override
    public void paint() {
        System.out.println("Paint shape with BLUE color");
    }
}
