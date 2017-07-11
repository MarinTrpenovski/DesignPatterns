package main.java.CreationalDesignPattern.SingletonPattern;

/**
 * Created by marin.trpenovski on 7/11/2017.
 */
public class StaticInitializedSingleton {

    private static StaticInitializedSingleton instance = new StaticInitializedSingleton();

    private StaticInitializedSingleton(){}

    static {
        try {
            instance = new StaticInitializedSingleton();
        } catch (Exception e) {
            System.out.println("Exception during instatiation " + e.getMessage());
        }
    }

    public static StaticInitializedSingleton getInstance(){
        return instance;
    }
}
