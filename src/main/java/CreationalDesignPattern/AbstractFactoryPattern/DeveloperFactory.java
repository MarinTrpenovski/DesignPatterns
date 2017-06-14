package main.java.CreationalDesignPattern.AbstractFactoryPattern;

/**
 * Created by marin.trpenovski on 6/14/2017.
 */
public class DeveloperFactory implements EmployeeAbstractFactory {

    private String name;
    private Integer age;
    private String position;

    public DeveloperFactory(String name, Integer age, String position){
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public Employee createEmployee() {
        return new Developer(name, age, position);
    }
}
