package main.java.StructuralDesignPattern.AdapterPattern;

/**
 * Created by marin.trpenovski on 7/18/2017.
 */
public class LaptopComputer implements ComputerReader {

    @Override
    public void readPcCard(String type) {
        //Nothing
    }

    @Override
    public void readLaptopCard(String type) {
        System.out.println("Reading Laptop card ....");
    }

}
