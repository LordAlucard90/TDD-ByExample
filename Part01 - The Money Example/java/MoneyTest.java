import Currency.Dollar;
import Currency.Franc;
import Currency.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MoneyTest {

    @Test
    public void TestMultiplication(){
        Money money = Money.dollar(5);
        assertEquals(Money.dollar(10), money.times(2));
        assertEquals(Money.dollar(15), money.times(3));
    }

    @Test
    public void TestFrancMultiplication(){
        Money franc = Money.franc(5);
        assertEquals(Money.franc(10), franc.times(2));
        assertEquals(Money.franc(15), franc.times(3));
    }

    @Test
    public void TestEquality(){
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(6));
        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.franc(5), Money.franc(6));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }
}


