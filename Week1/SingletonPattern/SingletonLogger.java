public class SingletonLogger {
    private static SingletonLogger instance;

    private SingletonLogger() {
        System.out.println("Logger Initialized");
    }

    public static SingletonLogger getInstance() {
        if (instance == null) {
            instance = new SingletonLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
