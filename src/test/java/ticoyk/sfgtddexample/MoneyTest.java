package ticoyk.sfgtddexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(8));
        assertNotEquals(Money.real(5), Money.dollar(5));
    }

}
