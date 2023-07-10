package bussiness_objects.payments;

public record MobilePayment(String mobileNumber, double amount) implements Payment{

    public MobilePayment(String mobileNumber, double amount) {
        this.mobileNumber = mobileNumber;
        this.amount = amount;
    }

    @Override
    public String mobileNumber() {
        return mobileNumber;
    }

    @Override
    public double amount() {
        return amount;
    }
}
