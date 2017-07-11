package main.java.CreationalDesignPattern.SingletonPattern;

/**
 * Created by marin.trpenovski on 7/11/2017.
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // Restrict client to access the constructor
    private EagerInitializedSingleton (){}

    public static EagerInitializedSingleton getInstance (){
        return instance;
    }
}
