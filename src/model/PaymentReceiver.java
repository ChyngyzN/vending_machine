package model;

public interface PaymentReceiver {
    void insertMoney(int amount);
    int getBalance();
    void reset();
    boolean isSufficient(int required);
}
