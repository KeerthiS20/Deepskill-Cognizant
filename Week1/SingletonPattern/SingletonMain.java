public class SingletonMain {
    public static void main(String[] args) {
        SingletonLogger logger1 = SingletonLogger.getInstance();
        logger1.log("This is the first log message.");

        SingletonLogger logger2 = SingletonLogger.getInstance();
        logger2.log("This is the second log message.");

        System.out.println("Are both loggers same? " + (logger1 == logger2));
    }
}

