package DesignPatterns.Adapter.BankAdapters;

import DesignPatterns.Adapter.BankApi;
import DesignPatterns.Adapter.BankApis.YesBankApi;

public class YesBankAdapter implements BankApi {
    // This class is an adapter for the Yes Bank API
    YesBankApi yesBankApi = new YesBankApi();
    @Override
    public int checkBalance(String accountNumber) {
        return yesBankApi.fetchBalance(accountNumber);
    }

    @Override
    public void transferMoney(String fromAccount, String toAccount, int amount) {
        yesBankApi.transferFunds(fromAccount, toAccount, amount);
    }
}
