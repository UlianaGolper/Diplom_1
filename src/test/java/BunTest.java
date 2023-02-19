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
                {"Любая другая булка", 1567},
                {"", 1234},
                {"😀", 1234},
                {null, 5678},
                {"1", 1234}, //минимальное количество символов
                //строка 100 символов
                {"TИiЦСHOPgdvЗZHsZtezAurdroEzЕФИqРЛvaЩАodЯНCPGgВAДfБАCРxОmЪЗPUШlМРhЕaUDetУsЬsЛuDnJQUTLYjmqrЯЕdНwЗtЫyaD", 9101},
                {"!@#$%^^&**()+_=", 12134},
                {"Флюоресцентная булка R2-D3", -988},
                {"Краторная булка N-200i", 0},
                {"Любая другая булка", Float.MIN_VALUE}, //минимальная цена
                {"Любая другая булка", Float.MAX_VALUE}, //максимальная цена

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