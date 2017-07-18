package main.java.StructuralDesignPattern.AdapterPattern;

/**
 * Created by marin.trpenovski on 7/18/2017.
 */
public class PcComputer implements ComputerReader {

    @Override
    public void readPcCard(String type) {
        System.out.println("Reading Pc card ....");
    }

    @Override
    public void readLaptopCard(String type) {

    }
}
