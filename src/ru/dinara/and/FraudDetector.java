package ru.dinara.and;

public class FraudDetector {
    public boolean isFraud(Transaction transaction) {
        return isFraudRule1(transaction)
                || isFraudRule2(transaction)
                || isFraudRule3(transaction)
                || isFraudRule4(transaction)
                || isFraudRule5(transaction);

    }

    private boolean isFraudRule1(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getFullName().equals("Pokemon");
    }

    private boolean isFraudRule2(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }

    private boolean isFraudRule3(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sydney");
    }

    private boolean isFraudRule4(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }

    private boolean isFraudRule5(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Germany") && transaction.getAmount() > 1000;
    }
}
