package main.java.StructuralDesignPattern.AdapterPattern;

/**
 * Created by marin.trpenovski on 7/18/2017.
 */
public class TestAdapterPattern {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        mobile.readCard("mobile", "samsung");
        mobile.readCard("laptop", "lenovo");
        mobile.readCard("laptop", "dell");
        mobile.readCard("pc", "apple");
        mobile.readCard("pc", "Hewlett-Packard");
        mobile.readCard("test unknown device", "unknown");
    }
}
