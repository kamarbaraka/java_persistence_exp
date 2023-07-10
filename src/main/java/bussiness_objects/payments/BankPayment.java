package bussiness_objects.payments;

public record BankPayment(String bankName, String accountName, double amount) implements Payment{

    public BankPayment(String bankName, String accountName, double amount) {
        this.bankName = bankName;
        this.accountName = accountName;
        this.amount = amount;
    }

    @Override
    public String bankName() {
        return bankName;
    }

    @Override
    public String accountName() {
        return accountName;
    }

    @Override
    public double amount() {
        return amount;
    }
}
