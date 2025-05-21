package DesignPatterns.Adapter.BankApis;

// External 3rd Part API
public class IciciBankApi {
    public int getBalance(String accountNumber) {
        // Simulate getting balance from ICICI Bank API
        return 10000; // Example balance
    }

    public void moneyTransfer(String fromAccount, String toAccount, int amount) {
        // Simulate money transfer using ICICI Bank API
        System.out.println("Transferred " + amount + " from " + fromAccount + " to " + toAccount);
    }
}
