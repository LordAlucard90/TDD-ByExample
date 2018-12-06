import Currency.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void TestMultiplication(){
        Money money = Money.dollar(5);
        assertEquals(Money.dollar(10), money.times(2));
        assertEquals(Money.dollar(15), money.times(3));
    }

    @Test
    public void TestEquality(){
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(6));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    public void TestCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}


