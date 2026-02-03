public class DivStrategy implements OperationStrategy {
    @Override
    public double doOperation(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        }
        return a / b;
    }
}
