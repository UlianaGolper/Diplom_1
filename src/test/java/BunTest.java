import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;


@RunWith(Parameterized.class)
public class BunTest {
    private final String expectedName;
    private final float expectedPrice;
    private Bun bun;

    public BunTest(String expectedName, float expectedPrice) {
        this.expectedName = expectedName;
        this.expectedPrice = expectedPrice;
    }

    @Parameterized.Parameters
    public static Object[][] bunParams() {
        return new Object[][]{
                {"Флюоресцентная булка R2-D3", 988},
                {"Краторная булка N-200i", 1255},
                {"Любая другая булка", 1567}

        };
    }

    @Test
    public void GetNameTest() {
        bun = new Bun(expectedName, expectedPrice);
        Assert.assertEquals(expectedName, bun.getName());
    }

    @Test
    public void GetPriceTest() {
        bun = new Bun(expectedName, expectedPrice);
        Assert.assertEquals(expectedPrice, bun.getPrice(), 0);
    }
}