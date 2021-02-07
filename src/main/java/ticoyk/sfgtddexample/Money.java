package ticoyk.sfgtddexample;

public class Money {
    protected int amount;

    protected String currency;

    protected Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }

    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    public static Money real(int amount){
        return new Money(amount, "BRL");
    }

    public int getAmount(){
        return this.amount;
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.getAmount()
                && this.currency.equals(money.currency);
    }
}
