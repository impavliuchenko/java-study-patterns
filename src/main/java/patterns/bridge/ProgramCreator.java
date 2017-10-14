package patterns.bridge;

public class ProgramCreator {
    public static void main(String[] args) {

        //we can change developer (detaching an abstraction from implementations)
        Program [] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for(Program p : programs){
            p.developProgram();
        }
    }
}
