package patterns.singleton;

public class ProgramRunner {

    public static void main(String[] args) {
        ProgramLogger programLogger = ProgramLogger.getProgramLogger();
        programLogger.addLoggingInfo("a");
        System.out.println(programLogger);
        programLogger.addLoggingInfo("b");
        programLogger.showLogFile();
        System.out.println(programLogger);
        programLogger.addLoggingInfo("c");
        programLogger.showLogFile();
        System.out.println(programLogger);

    }
}
