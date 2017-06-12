package main.java.CreationalDesignPattern.Factory;

/**
 * Created by marin.trpenovski on 6/12/2017.
 */
public class VehicleFactory {

    public static Vehicle getVehicle(String type, String power, Integer yearOfProduction) {

        if("BMW".equalsIgnoreCase(type)){
            return new BMW(power, yearOfProduction);
        } else if ("Mercedes".equalsIgnoreCase(type)){
            return new Mercedes(power, yearOfProduction);
        }

        return null;
    }
}
