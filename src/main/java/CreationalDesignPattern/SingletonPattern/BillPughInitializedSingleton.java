package main.java.CreationalDesignPattern.SingletonPattern;

/**
 * Created by marin.trpenovski on 7/11/2017.
 */
public class BillPughInitializedSingleton {

    private BillPughInitializedSingleton (){}

    private static class SingleHelper {
        private static final BillPughInitializedSingleton instance = new BillPughInitializedSingleton();
    }

    public static BillPughInitializedSingleton getInstance(){
        return SingleHelper.instance;
    }

}
