package helpers;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

/***
 * Helper Class to Handle logs in execution time.
 */
public abstract class LoggerHelper {
    private final static Logger _logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(LoggerHelper.class);

    /***
     * Write a warning message in stdout console.
     * @param message [String]
     */
    public static void logWarning(String message) {
        _logger.warn(message);
    }

    /***
     * Write an error message in stdout console.
     * @param message [String]
     */
    public static void logError(String message) {
        _logger.error(message);
    }

    /***
     * Write an info message in stdout console.
     * @param message [String]
     */
    public static void logInfo(String message) {
        _logger.info(message);
    }
}
