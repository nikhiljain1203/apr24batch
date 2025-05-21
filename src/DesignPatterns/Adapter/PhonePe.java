package DesignPatterns.Adapter;

public class PhonePe {
    private BankApi bankApi;
    private BillPayment billPayment;

    public PhonePe(BankApi bankApi) {
        this.bankApi = bankApi;
        this.billPayment = new BillPayment();
    }

    public void payBill(int amount, String accNumber) {
        // Logic to pay bill
        billPayment.payBill(accNumber, amount, bankApi);
    }
}
