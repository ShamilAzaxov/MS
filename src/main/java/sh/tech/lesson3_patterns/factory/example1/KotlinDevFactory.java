package sh.tech.lesson3_patterns.factory.example1;

public class KotlinDevFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new KotlinDev();
    }
}
