import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*
         * javac -d out *.java
         * java -cp out Main
         * 
         */

        Map<String, OperationStrategy> map = new HashMap<>();
        map.put("+", new AddStrategy());
        map.put("-", new SubStrategy());
        map.put("*", new MulStrategy());
        map.put("/", new DivStrategy());

        double a = 10;
        double b = 5;
        String op = "*";

        Calculator calculator = new Calculator(map.get(op));
        double result = calculator.execute(a, b);

        System.out.println(a + " " + op + " " + b + " = " + result);
    }
}
