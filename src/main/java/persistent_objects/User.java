package persistent_objects;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * a class to simulate a user and properties.
 * @author kamar baraka*/

@Entity
public class User {

    @Id
    @NotNull
    private String username;
    private String firstName;
    private String lastName;
    @NotNull
    private String contact;
    @NotNull
    private String role;

    @Column(name = "password", nullable = false)
    private String password;

    /**
     * foreign key*/
    @ManyToOne
    @JoinColumn(name = "address_zipcode")
    private Address address;

    @Column(name = "date_of_registration", nullable = false)
    private final Date dateOfRegistration = new Date();

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    /**
     * gets the user password.
     * @return the user password.*/
    public String getPassword() {
        return password;
    }

    /**
     * sets the user password.
     * */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * gets the user address.
     * @return the user address*/
    public Address getAddress() {
        return address;
    }

    /**
     * sets the user address*/
    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
