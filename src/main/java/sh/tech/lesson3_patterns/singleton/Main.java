package sh.tech.lesson3_patterns.singleton;

import sh.tech.lesson3_patterns.singleton.enum_based.SingletonEnum;
import sh.tech.lesson3_patterns.singleton.double_checked.SingletonDoubleCheckedLocking;
import sh.tech.lesson3_patterns.singleton.eager.SingletonEager;
import sh.tech.lesson3_patterns.singleton.lazy.SingletonLazy;
import sh.tech.lesson3_patterns.singleton.thread_safe.SingletonThreadSafe;

public class Main {
    public static void main(String[] args) {
        System.out.println("Eager based");
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager1 == singletonEager2);

        System.out.println("Lazy based");
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy1 == singletonLazy2);

        System.out.println("Thread safe based");
        SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe1 == singletonThreadSafe2);

        System.out.println("Double checked based");
        SingletonDoubleCheckedLocking doubleChecked1 = SingletonDoubleCheckedLocking.getInstance();
        SingletonDoubleCheckedLocking doubleChecked2 = SingletonDoubleCheckedLocking.getInstance();
        System.out.println(doubleChecked1 == doubleChecked2);

        System.out.println("Enum based");
        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum1 == singletonEnum2);
    }
}
