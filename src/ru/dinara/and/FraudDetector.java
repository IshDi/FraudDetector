package ru.dinara.and;

public class FraudDetector {
    public boolean isFraud(Transaction transaction) {
        FraudRule1 fraudRule1 = new FraudRule1();
        FraudRule2 fraudRule2 = new FraudRule2();
        FraudRule3 fraudRule3 = new FraudRule3();
        FraudRule4 fraudRule4 = new FraudRule4();
        FraudRule5 fraudRule5 = new FraudRule5();
        return fraudRule1.isFraud(transaction)
                || fraudRule2.isFraud(transaction)
                || fraudRule3.isFraud(transaction)
                || fraudRule4.isFraud(transaction)
                || fraudRule5.isFraud(transaction);
    }
}
