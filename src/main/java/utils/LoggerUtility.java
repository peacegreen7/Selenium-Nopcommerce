package utils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LoggerUtility {
    public static Logger getLogger(Class<?> className) {
        return LogManager.getLogger(className);
    }
}
