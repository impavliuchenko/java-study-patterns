package patterns.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("Java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }
    //creating instance based on the developer's speciality
    static DeveloperFactory createDeveloperBySpeciality(String speciality){
        if (speciality.equalsIgnoreCase("Java"))  return new JavaDeveloperFactory();
        else if (speciality.equalsIgnoreCase("C++")) return new CppDeveloperFactory();
        else throw new RuntimeException(speciality + " - no such developer");
    }
}
