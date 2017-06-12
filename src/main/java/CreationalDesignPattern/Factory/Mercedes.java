package main.java.CreationalDesignPattern.Factory;

/**
 * Created by marin.trpenovski on 6/12/2017.
 */
public class Mercedes extends Vehicle {

    private String power;
    private Integer yearOfProduction;

    public Mercedes(String power, Integer yearOfProduction) {
        this.power = power;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String getPower() {
        return this.power;
    }

    @Override
    public Integer getYearOfProduction() {
        return this.yearOfProduction;
    }
}
