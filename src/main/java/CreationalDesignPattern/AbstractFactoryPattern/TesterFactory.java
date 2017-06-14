package main.java.CreationalDesignPattern.AbstractFactoryPattern;

/**
 * Created by marin.trpenovski on 6/14/2017.
 */
public class TesterFactory implements EmployeeAbstractFactory {

    private String name;
    private Integer age;
    private String position;

    public TesterFactory (String name, Integer age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public Employee createEmployee() {
        return new Tester(name, age, position);
    }
}
