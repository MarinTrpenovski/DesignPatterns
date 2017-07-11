package main.java.CreationalDesignPattern.SingletonPattern;

/**
 * Created by marin.trpenovski on 7/11/2017.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton () {}

    public synchronized static ThreadSafeSingleton getInstance(){
        if (instance == null) {
            instance =  new ThreadSafeSingleton();
        }
        return instance;
    }

    public static ThreadSafeSingleton getInstanceWithDoubleLock (){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){
                    instance =  new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
