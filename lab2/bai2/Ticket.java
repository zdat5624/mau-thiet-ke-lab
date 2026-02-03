public class Ticket {
    private VehicleType vehicleType;
    private float hoursParked;
    private FeeStrategy feeStrategy;

    public Ticket(VehicleType vehicleType, float hoursParked) {
        this.vehicleType = vehicleType;
        this.hoursParked = hoursParked;

        switch (vehicleType) {
            case MOTORBIKE:
                this.feeStrategy = new MotorbikeFeeStrategy();
                break;
            case BICYCLE:
                this.feeStrategy = new BicycleFeeStrategy();
                break;

            default:
                this.feeStrategy = new CarFeeStrategy();
                break;
        }
    }

    public double calculateFee() {
        return feeStrategy.calculateFee(hoursParked);
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public float getHoursParked() {
        return hoursParked;
    }

}
