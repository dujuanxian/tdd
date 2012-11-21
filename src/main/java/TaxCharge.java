/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 11/21/12
 * Time: 7:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class TaxCharge {
    private static final Double START_PRICE = 6d;
    private double PRICE1 = 1.5d;
    private double DISTANCE1 = 2d;
    private double DISTANCE2 = 8d;

    public double countPrice(double miles) {
        double price = START_PRICE;
        if (miles > DISTANCE2) {
            price = 17.25d;
        } else if (miles > DISTANCE1) {
            price += PRICE1 * (miles - DISTANCE1);
        }
        return price;
    }
}
