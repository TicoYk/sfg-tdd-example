package ticoyk.sfgtddexample;

public interface Expression {

    Money reduce(Bank bank, String to);

    public Expression plus(Expression addend);

    Expression times(int multiplier);

}