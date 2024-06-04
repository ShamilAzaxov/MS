package sh.tech.lesson4_patterns.bridge;

public class KotlinDev implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Write kotlin code");
    }
}
