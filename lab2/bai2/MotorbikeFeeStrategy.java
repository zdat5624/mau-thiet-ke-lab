public class MotorbikeFeeStrategy implements FeeStrategy {
    private final float FEE_PER_HOUR = 5000;
    
    @Override
    public float calculateFee(float hours) {
        return FEE_PER_HOUR*hours;
    }
    
}
