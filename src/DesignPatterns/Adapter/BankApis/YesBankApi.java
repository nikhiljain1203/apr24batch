package DesignPatterns.Adapter.BankApis;

// External 3rd Party API
public class YesBankApi {
    public int fetchBalance(String accountNumber) {
        // Simulate getting balance from Yes Bank API
        return 15000; // Example balance
    }

    public void transferFunds(String fromAccount, String toAccount, int amount) {
        // Simulate money transfer using Yes Bank API
        System.out.println("Transferred " + amount + " from " + fromAccount + " to " + toAccount);
    }
}
