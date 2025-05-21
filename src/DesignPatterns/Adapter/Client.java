package DesignPatterns.Adapter;

import DesignPatterns.Adapter.BankAdapters.YesBankAdapter;

public class Client {
    public static void main(String[] args) {
        BankApi bankApi = new YesBankAdapter();
        PhonePe phonePe = new PhonePe(bankApi);
        String accountNumber = "1234567890";
        int amount = 1000;
        phonePe.payBill(amount, accountNumber);
    }
}
