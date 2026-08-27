package SingletonDesignPattern;

import java.sql.Timestamp;

public class BillPughLogger {

    private BillPughLogger() {
    }

    // Inner static class responsible for holding the Singleton instance
    // This class will not be loaded into memory until the getInstance() method is
    // called
    // This ensures that the instance is created only when it is needed, providing
    // lazy initialization
    // The JVM guarantees that the class will be loaded and initialized in a
    // thread-safe manner
    private static class LoggerHelper {
        private static final BillPughLogger INSTANCE = new BillPughLogger();
    }

    public static BillPughLogger getInstance() {
        return LoggerHelper.INSTANCE;
    }

    public void error(String message, Timestamp timeStamp) {
        System.out.println("Error: " + message + " at " + timeStamp.getTime());
    }

    public void info(String message, Timestamp timeStamp) {
        System.out.println("Info: " + message + " at " + timeStamp.getTime());
    }

}
