public class CarFeeStrategy implements FeeStrategy {
    private final float FEE_PER_HOUR = 20000;

    @Override
    public float calculateFee(float hours) {
        return FEE_PER_HOUR*hours;
    }
    
}
