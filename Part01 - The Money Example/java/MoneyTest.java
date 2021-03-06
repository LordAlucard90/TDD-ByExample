import Currency.Bank;
import Currency.Expression;
import Currency.Money;
import Currency.Sum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void testMultiplication(){
        Money money = Money.dollar(5);
        assertEquals(Money.dollar(10), money.times(2));
        assertEquals(Money.dollar(15), money.times(3));
    }

    @Test
    public void testEquality(){
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(6));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testSimpleAddition(){
        Money fiveDollars = Money.dollar(5);
        Expression sum = fiveDollars.plus(fiveDollars);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @Test
    public void testPlusReturnsSum(){
        Money fiveDollars = Money.dollar(5);
        Sum sum = (Sum) fiveDollars.plus(fiveDollars);
        assertEquals(fiveDollars, sum.augend);
        assertEquals(fiveDollars, sum.addend);
    }

    @Test
    public void testReduceSum(){
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), reduced);
    }

    @Test
    public void testReduceMoney(){
        Bank bank = new Bank();
        Money reduced = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), reduced);
    }

    @Test
    public void testReduceMoneyDifferentCurrency(){
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testIdentityRate(){
        assertEquals(1, new Bank().rate("USD", "USD"));
    }

    @Test
    public void testMixedAddiction(){
        Expression fiveUSD = Money.dollar(5);
        Expression tenCHF = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(fiveUSD.plus(tenCHF), "USD");
        assertEquals(Money.dollar(10), result);
    }

    @Test
    public void testSumPlusMoney(){
        Expression fiveUSD = Money.dollar(5);
        Expression tenCHF = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum = new Sum(fiveUSD, tenCHF).plus(fiveUSD);
        Money result = sum.reduce(bank, "USD");
        assertEquals(Money.dollar(15), result);
    }

    @Test
    public void testSumTimes(){
        Expression fiveUSD = Money.dollar(5);
        Expression tenCHF = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum = new Sum(fiveUSD, tenCHF).times(2);
        Money result = sum.reduce(bank, "USD");
        assertEquals(Money.dollar(20), result);
    }
}


