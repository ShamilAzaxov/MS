package sh.tech.lesson3_patterns.factory.example1;

public class JavaDevFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDev();
    }
}
