package main.java.CreationalDesignPattern.AbstractFactoryPattern;

/**
 * Created by marin.trpenovski on 6/14/2017.
 */
public class Developer extends Employee{

    private String name;
    private Integer age;
    private String position;

    public Developer(String name, Integer age, String position){
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String getPosition() {
        return this.position;
    }
}
