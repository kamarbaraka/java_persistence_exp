package bussiness_objects.payments;

public record CashPayment(double amount) implements Payment{

    public CashPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double amount() {
        return amount;
    }
}
