package sh.tech.lesson4_patterns.bridge;

public class JavaDev implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Write java code");
    }
}
