import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class TddTest {

    private Tdd tdd;

    @Before
    public void setUp() throws Exception {
        tdd = new Tdd();
    }

    @Test
    public void testName() throws Exception {
        tdd.init(3);
        assertThat(tdd.getNumber(), Is.is(3));
    }
}
