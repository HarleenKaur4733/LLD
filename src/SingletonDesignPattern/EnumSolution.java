package SingletonDesignPattern;

import java.sql.Timestamp;

public enum EnumSolution {

    INSTANCE;

    public void error(String message, Timestamp timeStamp) {
        System.out.println("Error: " + message + " at " + timeStamp.getTime());
    }

    public void info(String message, Timestamp timeStamp) {
        System.out.println("Info: " + message + " at " + timeStamp.getTime());
    }
}

// use it like EnumSolution.INSTANCE.error("This is an error message", new
// Timestamp(System.currentTimeMillis()));
