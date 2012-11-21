import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class TaxChargeTest {

    TaxCharge charger;

    @Before
    public void setUp() throws Exception {
        charger = new TaxCharge();
    }

    @Test
    public void shouldChargeStartingPriceBetween0To2Kilometers() {
        double distance = 1.2;

        assertThat(charger.countPrice(distance), is(6.0d));
    }

    @Test
    public void shouldChargeStartingPriceEquals2Kilometers() {
        double distance = 2;

        assertThat(charger.countPrice(distance), is(6.0d));
    }

    @Test
    public void shouldChargeFor3Kilometers() {
        double distance = 3;

        assertThat(charger.countPrice(distance), is(7.5d));
    }

    @Test
    public void shouldChargeFor8Kilometers(){
        double distance = 8;
        assertThat(charger.countPrice(distance), is(15d));
    }

    @Test
    public void shouldChargeFor9Kilometers(){
        double distance = 9;
        assertThat(charger.countPrice(distance), is(17.25d));
    }




}
