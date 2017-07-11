package main.java.CreationalDesignPattern.SingletonPattern;

import java.io.Serializable;

/**
 * Created by marin.trpenovski on 7/11/2017.
 */
public class SerializedSingleton implements Serializable {

    private static final long SerialVersionUID = -1283717892L;

    private SerializedSingleton () {}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
}
