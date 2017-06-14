package main.java.CreationalDesignPattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marin.trpenovski on 6/14/2017.
 */
public class TestPrototypePattern {

    public static void main(String[] args) throws CloneNotSupportedException{
        Employee employee = new Employee();
        employee.loadEmployees();

        Employee emp1 = (Employee) employee.clone();
        Employee emp2 = (Employee) employee.clone();
        List<String> list = emp1.getEmployeeList();
        list.add("Andov");
        List<String> list1 = emp2.getEmployeeList();
        list1.remove("Gjoko");

        System.out.println(" employees are " + employee.getEmployeeList());
        System.out.println(" employees after adding " + list);
        System.out.println(" employees after removing " + list1);
    }
}
