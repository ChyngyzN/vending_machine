package model;

public class CoinAcceptor implements PaymentReceiver {
    private int amount;

    public CoinAcceptor() {
        this.amount = 0;
    }

    @Override
    public void insertMoney(int amount) {
        this.amount += amount;
    }

    @Override
    public int getBalance() {
        return amount;
    }

    @Override
    public void reset() {
        amount = 0;
    }

    @Override
    public boolean isSufficient(int required) {
        return amount >= required;
    }
}
