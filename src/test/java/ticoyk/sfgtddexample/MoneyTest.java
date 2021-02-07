package ticoyk.sfgtddexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Money myMoney = Money.dollar(5);
        Money product = myMoney.times(2);
        Assertions.assertEquals(5, myMoney.getAmount());
        Assertions.assertEquals(10, product.getAmount());
    }

    @Test
    void testEqualityDollar() {
        assertEquals(true, Money.dollar(5).equals(Money.dollar(5)));
        assertEquals(false, Money.dollar(8).equals(Money.dollar(5)));
        assertEquals(false, Money.dollar(5).equals(Money.real(5)));
    }

}
