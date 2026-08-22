package SingletonDesignPattern;

import java.sql.Timestamp;

// Double checked logging singleton pattern
public class Logger {
    private static volatile Logger instance;

    private Logger() {
    }

    public void error(String message, Timestamp timeStamp) {
        System.out.println("Error: " + message + " at " + timeStamp.getTime());
    }

    public void info(String message, Timestamp timeStamp) {
        System.out.println("Info: " + message + " at " + timeStamp.getTime());
    }

    public static Logger getInstance() {
        if (instance == null) {

            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
}
