package DesignPatterns.Adapter.BankAdapters;

import DesignPatterns.Adapter.BankApi;
import DesignPatterns.Adapter.BankApis.IciciBankApi;

public class IciciBankAdapter implements BankApi {
    // This class is an adapter for the ICICI Bank API
    IciciBankApi iciciBankApi = new IciciBankApi();
    @Override
    public int checkBalance(String accountNumber) {
        // Logic to check balance using ICICI Bank API
        return iciciBankApi.getBalance(accountNumber);
    }

    @Override
    public void transferMoney(String fromAccount, String toAccount, int amount) {
        // Logic to transfer money using ICICI Bank API
        iciciBankApi.moneyTransfer(fromAccount, toAccount, amount);
    }
}
