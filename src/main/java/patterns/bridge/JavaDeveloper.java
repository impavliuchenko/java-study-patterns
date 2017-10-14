package patterns.bridge;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Writes Java code");
    }
}
