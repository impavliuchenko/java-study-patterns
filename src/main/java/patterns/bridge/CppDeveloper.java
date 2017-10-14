package patterns.bridge;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Writes C++ code");
    }
}
