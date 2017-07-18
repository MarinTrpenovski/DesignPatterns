package main.java.StructuralDesignPattern.AdapterPattern;

/**
 * Created by marin.trpenovski on 7/18/2017.
 */
public interface ComputerReader {

    void readPcCard(String type);

    void readLaptopCard(String type);
}
