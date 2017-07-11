package main.java.CreationalDesignPattern.SingletonPattern;

/**
 * Created by marin.trpenovski on 7/11/2017.
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton (){}

    public static LazyInitializedSingleton getInstance(){
        if (instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

}
