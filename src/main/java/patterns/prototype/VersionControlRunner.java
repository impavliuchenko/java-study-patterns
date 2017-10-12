package patterns.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"SuperProject",
                "SourceCode sourceCode = new SourceCode();");
        System.out.println(master);

        // 2 ways to make copy of object "master"
        // The first is not the best way because of casting:
        Project masterClone1 = (Project) master.copy();
        System.out.println("\n==========================\n");
        System.out.println(masterClone1);

        // The second way: we're creating factory and call the method copyProject - without casting
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone2 = factory.copyProject();
        System.out.println("\n==========================\n");
        System.out.println(masterClone2);
    }
}
