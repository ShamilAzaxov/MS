package sh.tech.lesson3_patterns.factory.example1;

public class Software {
    public static void main(String[] args) {
        var developerFactoryByLanguage = createDeveloperFactoryByLanguage(ProgrammingLanguage.PYTHON);
        var developer = developerFactoryByLanguage.createDeveloper();
        developer.writeCode();
    }

    private static DeveloperFactory createDeveloperFactoryByLanguage(ProgrammingLanguage programmingLanguage){
        return switch (programmingLanguage){
            case JAVA -> new JavaDevFactory();
            case KOTLIN -> new KotlinDevFactory();
            case PYTHON -> new PythonDevFactory();
        };
    }
}
