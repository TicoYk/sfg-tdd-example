package ticoyk.sfgtddexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar myMoney = new Dollar(5);
        myMoney.times(2);
        assertEquals(10, myMoney.amount);
    }
}
