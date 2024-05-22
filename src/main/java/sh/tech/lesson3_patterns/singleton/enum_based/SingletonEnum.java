package sh.tech.lesson3_patterns.singleton.enum_based;

public enum SingletonEnum {
    INSTANCE;

    public void doSomething() {
        System.out.println("something");
    }

    public String doAnotherThing(String thing) {
        return "I am doing + " + thing;
    }
}
