package main.java.CreationalDesignPattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marin.trpenovski on 6/14/2017.
 */
public class Employee implements Cloneable {

    private List<String> employeeList;

    public Employee(){
        employeeList = new ArrayList<>();
    }

    public Employee(List<String> list){
        this.employeeList = list;
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }

    public void loadEmployees(){
        this.employeeList.add("Marin");
        this.employeeList.add("Gjoko");
        this.employeeList.add("Katerina");
        this.employeeList.add("Natasha");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmployeeList()) {
            temp.add(s);
        }
        return new Employee(temp);
    }

}
