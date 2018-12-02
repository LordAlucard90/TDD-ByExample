package Currency;

public abstract class Money {
    protected int amount;

    @Override
    public boolean equals(Object other) {
        return ((Money) other).amount == this.amount && getClass().equals(other.getClass());
    }

    public static Money dollar(int amount){
        return new Dollar(amount);
    }

    public static Money franc(int amount){
        return new Franc(amount);
    }

    public abstract Money times(int amount);
}
