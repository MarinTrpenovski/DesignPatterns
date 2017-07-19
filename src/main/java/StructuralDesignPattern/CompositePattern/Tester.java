package main.java.StructuralDesignPattern.CompositePattern;

/**
 * Created by marin.trpenovski on 7/19/2017.
 */
public class Tester implements Employee {

    private String name;
    private Double salary;
    private String position;

    public Tester(String name, Double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    @Override
    public Double getSalary() {
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void add(Employee e) {
        //Tester is Leaf object, no other child object
    }

    @Override
    public void remove(Employee e1) {
        //Tester is Leaf object
    }

    @Override
    public Employee getChild(int i) {
        return null;
    }

    @Override
    public void print() {
        System.out.println(" =================== ");
        System.out.println("Name of Employee is " + getName());
        System.out.println("Salary is " + getSalary());
        System.out.println("Position is " + getPosition());
    }
}
