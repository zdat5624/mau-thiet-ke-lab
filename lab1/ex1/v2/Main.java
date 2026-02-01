
public class Main {
    public static void main(String[] args) {

        Logger logger = new Logger();

        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                logger.logMessage("Logging v2 -");
            }
        };

        for (int i = 0; i < 10; i++) {
            new Thread(task).start();
        }
    }
}

