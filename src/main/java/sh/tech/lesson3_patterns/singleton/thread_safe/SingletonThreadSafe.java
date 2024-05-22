package sh.tech.lesson3_patterns.singleton.thread_safe;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {

    }

    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafe();
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
