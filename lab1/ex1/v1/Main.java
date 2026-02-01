
public class Main {
    public static void main(String[] args) {

        Logger logger = new Logger();

        for (int i = 1; i <= 10; i++) {
            logger.logMessage("Logging v1 - ");
        }

        System.out.println("Final count = " + Logger.count);
    }
}
