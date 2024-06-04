package sh.tech.lesson3_patterns.singleton.lazy;

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {

    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("something");
    }

    public String doAnotherThing(String thing) {
        return "I am doing + " + thing;
    }
}