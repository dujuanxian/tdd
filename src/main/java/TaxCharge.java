public class TaxCharge {
    private static final Double START_PRICE = 6d;
    private double PRICE_PER_KILOMETER = 1.5d;
    private double START_DISTANCE = 2d;
    private double EXTEND_DISTANCE = 8d;

    public double countPrice(double distance) {
        double price = 0d;
        if (distance > EXTEND_DISTANCE) {
            price = 17.25d;
        } else if (distance > START_DISTANCE) {
            price = START_PRICE + PRICE_PER_KILOMETER * (distance - START_DISTANCE);
        }
        return price;
    }
}
