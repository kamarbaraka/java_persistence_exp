package bussiness_objects;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Customer {

    @Id
    @GeneratedValue
    private long id;
    private String name, contact;
    private Address address;

    public Customer(String name, String contact, Address address) {
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
