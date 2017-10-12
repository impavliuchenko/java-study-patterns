package patterns.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is a log file. \n";


    public static ProgramLogger getProgramLogger() {
        if (programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger(){
    }

    public void addLoggingInfo(String logInfo){
        logFile += logInfo + "\n";
    }
    public void showLogFile(){
        System.out.println(logFile);
    }
}
