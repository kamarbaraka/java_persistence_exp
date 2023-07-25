package persistent_objects;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * a class to represent a bill.
 * @author kamar baraka*/

@Entity
public class Bill {

    @Id
    @GeneratedValue
    private long id;


    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Enumerated
    @Column(name = "payment_method", nullable = false)
    private PaymentMethods paymentMethod;

    @ManyToOne(optional = false)
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    @Column(name = "amount", nullable = false)
    private double amount;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "date_of_issue", nullable = false)
    private final LocalDate dateOfIssue = LocalDate.now();

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public PaymentMethods getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethods paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
