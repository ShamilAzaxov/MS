package sh.tech.lesson3_patterns.abstract_factory;

public class Red implements Colour{

    public Red() {
    }

    @Override
    public void paint() {
        System.out.println("Paint shape with RED color");
    }
}
