import Currency.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MoneyTest {

    @Test
    public void TestMultiplication(){
        Dollar dollar = new Dollar(5);
        assertEquals(new Dollar(10), dollar.times(2));
        assertEquals(new Dollar(15), dollar.times(3));
    }

    @Test
    public void TestEquality(){
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(6));
    }
}