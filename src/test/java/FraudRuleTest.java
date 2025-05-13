package test.java;

import org.junit.jupiter.api.Test;
import ru.dinara.and.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudRuleTest {
    private FraudRule1 fraudRule1 = new FraudRule1();
    private FraudRule2 fraudRule2 = new FraudRule2();
    private FraudRule3 fraudRule3 = new FraudRule3();
    private FraudRule4 fraudRule4 = new FraudRule4();
    private FraudRule5 fraudRule5 = new FraudRule5();

    @Test
    public void shouldBeFraudRule1() {
        Trader trader = new Trader("Pokemon", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 500);
        assertTrue(fraudRule1.isFraud(transaction));
    }

    @Test
    public void shouldBeNotFraudRule1() {
        Trader trader = new Trader("Nina", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 500);
        assertFalse(fraudRule1.isFraud(transaction));
    }

    @Test
    public void shouldBeFraudRule2() {
        Trader trader = new Trader("Nina", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 10000001);
        assertTrue(fraudRule2.isFraud(transaction));
    }

    @Test
    public void shouldBeNotFraudRule2() {
        Trader trader = new Trader("Nina", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 500);
        assertFalse(fraudRule2.isFraud(transaction));
    }

    @Test
    public void shouldBeFraudRule3() {
        Trader trader = new Trader("Nina", "Sydney", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudRule3.isFraud(transaction));
    }

    @Test
    public void shouldBeNotFraudRule3() {
        Trader trader = new Trader("Nina", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 500);
        assertFalse(fraudRule3.isFraud(transaction));
    }

    @Test
    public void shouldBeFraudRule4() {
        Trader trader = new Trader("Nina", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudRule4.isFraud(transaction));
    }

    @Test
    public void shouldBeNotFraudRule4() {
        Trader trader = new Trader("Nina", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 500);
        assertFalse(fraudRule4.isFraud(transaction));
    }

    @Test
    public void shouldBeFraudRule5() {
        Trader trader = new Trader("Nina", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        assertTrue(fraudRule5.isFraud(transaction));
    }

    @Test
    public void shouldBeNotFraudRule5() {
        Trader trader = new Trader("Nina", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 500);
        assertFalse(fraudRule5.isFraud(transaction));
    }

}
