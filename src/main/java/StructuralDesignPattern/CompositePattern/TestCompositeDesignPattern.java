package main.java.StructuralDesignPattern.CompositePattern;

/**
 * Created by marin.trpenovski on 7/19/2017.
 */
public class TestCompositeDesignPattern {

    public static void main(String[] args) {

        Employee topManagement = new TopManagement("Dido", 10000.00, "CEO");
        Employee developmentLeaderShip = new DevelopmentLeadership("Emil", 4000.00, "Web Development");
        Employee developmentLeaderShip1 = new DevelopmentLeadership("Alina Pashkova", 3500.00, "Business Analyst Lead");
        Employee teamLeader = new TeamLeaders("Aleksandar Andov", 3000.00, "IBM Team Leader");
        Employee teamLeader1 = new TeamLeaders("Nikola Tanev", 3000.00, "Ving Team Leader");
        Employee qualityAssurance = new QualityAssurance("Lyuba", 4000.00, "Director of Q&A, Telecom LoB");
        Employee qualityAssurance1 = new QualityAssurance("Vlatko Miovski", 3500.00, "Q&A Lead");
        Employee developer = new Developer("Marin", 1000.00, "Java Developer");
        Employee developer1 = new Developer("Gjoko", 1000.00, "Python Developer");
        Employee developer2 = new Developer("Katerina", 1000.00, ".NET Developer");
        Employee developer3 = new Developer("Sara", 1000.00, "Front-end Developer");
        Employee developer4 = new Developer("Aleksandar", 1000.00, "Backend Developer");
        Employee tester = new Tester("Natasha", 1000.00, "Manual Tester");
        Employee tester1 = new Tester("Trajko" , 1000.00, "Automation Tester");
        Employee tester2 = new Tester("Riste", 1500.00, "Senior Automation tester");

        qualityAssurance.add(tester);
        qualityAssurance.add(tester1);
        qualityAssurance1.add(tester2);
        teamLeader.add(developer);
        teamLeader.add(developer1);
        teamLeader1.add(developer2);
        teamLeader1.add(developer3);
        teamLeader.add(developer4);
        developmentLeaderShip.add(teamLeader);
        developmentLeaderShip.add(qualityAssurance);
        developmentLeaderShip1.add(teamLeader1);
        developmentLeaderShip1.add(qualityAssurance1);
        topManagement.add(developmentLeaderShip);
        topManagement.add(developmentLeaderShip1);

        topManagement.print();
    }
}
