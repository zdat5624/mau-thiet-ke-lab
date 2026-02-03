public class Calculator {
    private OperationStrategy strategy;

    public Calculator(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public double execute(double a, double b) {
        return strategy.doOperation(a, b);
    }
}
