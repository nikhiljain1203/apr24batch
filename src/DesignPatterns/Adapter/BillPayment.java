package DesignPatterns.Adapter;

public class BillPayment {
    public void payBill(String accountNumber, int amount, BankApi bankApi) {
        // Logic to pay the bill
        if(amount <= bankApi.checkBalance(accountNumber)) {
            System.out.println("Bill paid successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
