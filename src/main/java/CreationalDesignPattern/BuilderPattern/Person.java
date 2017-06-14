package main.java.CreationalDesignPattern.BuilderPattern;

import java.beans.PropertyVetoException;

/**
 * Created by marin.trpenovski on 6/14/2017.
 */
public class Person {

    private String name;
    private String surname;

    private boolean isAdult;
    private boolean isMarried;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public boolean isMarried() {
        return isMarried;
    }

    private Person(PersonBuilder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.isAdult = builder.isAdult;
        this.isMarried = builder.isMarried;
    }

    public static class PersonBuilder{

        private String name;
        private String surname;

        private boolean isAdult;
        private boolean isMarried;

        public PersonBuilder(String name, String surname){
            this.name = name;
            this.surname = surname;
        }

        public PersonBuilder setAdult(boolean adult) {
            isAdult = adult;
            return this;
        }

        public PersonBuilder setMarried(boolean married) {
            isMarried = married;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", isAdult=" + isAdult +
                ", isMarried=" + isMarried +
                '}';
    }
}
