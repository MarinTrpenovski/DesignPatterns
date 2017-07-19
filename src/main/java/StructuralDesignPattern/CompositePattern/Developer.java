package main.java.StructuralDesignPattern.CompositePattern;

/**
 * Created by marin.trpenovski on 7/19/2017.
 */
public class Developer implements Employee {

    private String name;
    private Double salary;
    private String position;

    public Developer(String name, Double salary, String position) {
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
        //Developer is Leaf so no adding Employees
    }

    @Override
    public void remove(Employee e1) {
        //Developer is Leaf so no removing Employees
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
