package sh.tech.lesson3_patterns.singleton.double_checked;

public class SingletonDoubleCheckedLocking {

    private static volatile SingletonDoubleCheckedLocking instance;

    private  SingletonDoubleCheckedLocking(){

    }

    public static  SingletonDoubleCheckedLocking getInstance(){
        if (instance == null){
            synchronized ( SingletonDoubleCheckedLocking.class){
                if (instance == null){
                    instance = new  SingletonDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("something");
    }

    public String doAnotherThing(String thing){
        return "I am doing + " + thing;
    }
}
