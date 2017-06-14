package main.java.CreationalDesignPattern.BuilderPattern;

/**
 * Created by marin.trpenovski on 6/14/2017.
 */
public class TestBuilderPattern {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("Marin", "Trpenovski").setAdult(true).setMarried(false).build();
        System.out.println("Person is " + person);
    }
}
