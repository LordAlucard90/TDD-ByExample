import Currency.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyTest {

    @Test
    public void TestMultiplication(){
        Dollar dollar = new Dollar(5);
        Dollar product = dollar.times(2);
        assertEquals(10, product.amount);
        product = dollar.times(3);
        assertEquals(15, product.amount);
    }
}