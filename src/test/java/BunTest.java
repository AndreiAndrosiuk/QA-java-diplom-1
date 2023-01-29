import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {


    @Test
    public void getBunNameTest() {
        Bun bun = new Bun("Булочка с кунжутом", 55.00f);
        String expected = "Булочка с кунжутом";
        String actual = bun.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getBunPriceTest() {
        Bun bun = new Bun("Булочка с кунжутом", 55.00f);
        float expected = 55.00f;
        float actual = bun.getPrice();
        assertEquals(expected, actual, 0.00f);
    }


}
