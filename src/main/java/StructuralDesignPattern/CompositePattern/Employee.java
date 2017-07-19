package main.java.StructuralDesignPattern.CompositePattern;

/**
 * Created by marin.trpenovski on 7/19/2017.
 */
public interface Employee {

    Double getSalary();

    String getName();

    String getPosition();

    void add(Employee e);

    void remove(Employee e1);

    Employee getChild(int i);

    void print();

}
