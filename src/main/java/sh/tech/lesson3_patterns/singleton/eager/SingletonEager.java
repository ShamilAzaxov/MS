package sh.tech.lesson3_patterns.singleton.eager;

public class SingletonEager {
    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {
        // private constructor to prevent instantiation
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }

    public void doSomething(){
        System.out.println("something");
    }

    public String doAnotherThing(String thing){
        return "I am doing + " + thing;
    }
}
