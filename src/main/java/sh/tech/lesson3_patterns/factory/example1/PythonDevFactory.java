package sh.tech.lesson3_patterns.factory.example1;

public class PythonDevFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PythonDev();
    }
}
