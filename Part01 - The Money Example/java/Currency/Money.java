package Currency;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object other) {
        return ((Money) other).amount == this.amount;
    }
}
