import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TaxChargeTest {

    TaxCharge taxCharge;

    @Before
    public void setUp() throws Exception {
        taxCharge = new TaxCharge();
    }

    @Test
    public void shouldChargeFor1Kilometers() {
        double distance = 1d;

        assertThat(countPrice(distance), is(6.0d));
    }

    @Test
    public void shouldChargeFor2Kilometers() {
        double distance = 2d;

        assertThat(countPrice(distance), is(6.0d));
    }

    @Test
    public void shouldChargeFor3Kilometers() {
        double distance = 3d;

        assertThat(countPrice(distance), is(7.5d));
    }

    @Test
    public void shouldChargeFor8Kilometers(){
        double distance = 8d;

        assertThat(countPrice(distance), is(15d));
    }

    @Test
    public void shouldChargeFor9Kilometers(){
        double distance = 9d;

        assertThat(countPrice(distance), is(17.25d));
    }

    private double countPrice(double distance) {
        return taxCharge.countPrice(distance);
    }
}
