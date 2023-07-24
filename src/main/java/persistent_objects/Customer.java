package persistent_objects;

import javax.persistence.*;

/**
 * a class to represent a customer and properties.
 * @author kamar baraka*/

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "customer_contact", nullable = false)
    private String customerContact;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "address_zipcode", nullable = false)
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
