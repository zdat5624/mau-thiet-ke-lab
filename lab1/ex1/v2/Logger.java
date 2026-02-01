
public class Logger {

    public static int count = 0;

    public Logger() {
    }

    public void logMessage(String msg) {
        count++; 
        System.out.println(Thread.currentThread().getName()
                + " : " + msg + " count = " + count);
    }
}
