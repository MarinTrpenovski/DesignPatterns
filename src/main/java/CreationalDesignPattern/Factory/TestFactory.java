package main.java.CreationalDesignPattern.Factory;

/**
 * Created by marin.trpenovski on 6/12/2017.
 */
public class TestFactory {

    public static void main(String[] args) {

        Vehicle bmw = VehicleFactory.getVehicle("BMW", "260 KS", 2014);

        Vehicle mercedes = VehicleFactory.getVehicle("Mercedes", "360 KS", 2016);

        System.out.println("BMW vehicle " + bmw);
        System.out.println("Mercedes vehicle " + mercedes);
    }
}
