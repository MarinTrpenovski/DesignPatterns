package main.java.CreationalDesignPattern.AbstractFactoryPattern;

/**
 * Created by marin.trpenovski on 6/14/2017.
 */
public class TestAbstractFactory {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory(){

        Employee developer = EmployeeFactory.getEmployee(new DeveloperFactory("Marin" , 27, "Software Engineer"));
        Employee tester = EmployeeFactory.getEmployee(new TesterFactory("Trajko" , 30 , "Quality Assurance"));

        System.out.println("Developer is : " + developer);
        System.out.println("Tester is : q" + tester);
    }
}
