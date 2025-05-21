package DesignPatterns.Adapter;

public interface BankApi {
    int checkBalance(String accountNumber);
    void transferMoney(String fromAccount, String toAccount, int amount);
}
