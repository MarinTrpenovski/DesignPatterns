package main.java.StructuralDesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by marin.trpenovski on 7/19/2017.
 */
public class DevelopmentLeadership implements Employee {

    private String name;
    private Double salary;
    private String position;

    public DevelopmentLeadership(String name, Double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    List<Employee> employees = new ArrayList<>();

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
        employees.add(e);
    }

    @Override
    public void remove(Employee e1) {
        employees.remove(e1);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public void print() {
        System.out.println(" =================== ");
        System.out.println("Name of Employee is " + getName());
        System.out.println("Salary is " + getSalary());
        System.out.println("Position is " + getPosition());
        Iterator<Employee> employeeIterator = employees.iterator();
        while(employeeIterator.hasNext()) {
            Employee employee =  employeeIterator.next();
            employee.print();
        }
    }
}
