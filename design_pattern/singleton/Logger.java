package singleton;

public class Logger {
    private static Logger instance = new Logger();

    private Logger() {
    }

    int a = 12;

    public static Logger getInstance() {
        return instance;
    }
}
