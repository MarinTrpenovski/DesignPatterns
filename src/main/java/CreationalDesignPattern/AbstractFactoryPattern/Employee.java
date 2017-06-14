package main.java.CreationalDesignPattern.AbstractFactoryPattern;

/**
 * Created by marin.trpenovski on 6/14/2017.
 */
public abstract class Employee {

    public abstract String getName();
    public abstract Integer getAge();
    public abstract String getPosition();

    @Override
    public String toString() {
        return "Employee " + this.getName() + " is " + this.getAge() + " old  and work as " + this.getPosition();
    }
}
