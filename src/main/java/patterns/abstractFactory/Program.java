package patterns.abstractFactory;

import patterns.abstractFactory.banking.BankingTeamFactory;

public class Program {
    public static void main(String[] args) {

        //by changing implemented class BankingTeamFactory we're changing the team
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        Tester tester = projectTeamFactory.getTester();

        developer.writeCode();
        projectManager.manageProject();
        tester.testCode();




    }
}
