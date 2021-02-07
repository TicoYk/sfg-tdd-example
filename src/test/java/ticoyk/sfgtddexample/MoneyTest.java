package ticoyk.sfgtddexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar myMoney = new Dollar(5);
        Dollar product = myMoney.times(2);
        assertEquals(5, myMoney.amount);
        assertEquals(10, product.amount);
    }
}
