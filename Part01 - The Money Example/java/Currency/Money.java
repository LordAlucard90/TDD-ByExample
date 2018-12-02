package Currency;

public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object other) {
        return ((Money) other).amount == this.amount && getClass().equals(other.getClass());
    }

    public static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount){
        return new Franc(amount, "CHF");
    }

    public abstract Money times(int amount);

    public String currency() {
        return currency;
    }
}
