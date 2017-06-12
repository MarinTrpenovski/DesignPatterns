package main.java.CreationalDesignPattern.Factory;

/**
 * Created by marin.trpenovski on 6/12/2017.
 */
public abstract class Vehicle {

    public abstract String getPower();
    public abstract Integer getYearOfProduction();


    @Override
    public String toString() {
        return " has " + this.getPower() + " and year of production is " + this.getYearOfProduction();
    }
}
