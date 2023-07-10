package bussiness_objects;

import bussiness_objects.payments.Payment;
import persistent_objects.Item;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Bill {
    @Id
    @GeneratedValue
    private long id;
    private Customer customer;
    private Payment paymentMethod;
    private List<Item> items;
    private LocalDate date;

    public Bill(Customer customer, Payment paymentMethod, Item... items) {
        this.customer = customer;
        this.paymentMethod = paymentMethod;
        this.date = LocalDate.now();
        this.items.addAll(Arrays.asList(items));
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
