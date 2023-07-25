package persistent_objects;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

/**
 * a class to represent completed orders.
 * @author kamar baraka*/

//@Entity
public class CompletedOrder {

    /*@Id
    @GeneratedValue
    @NotNull
    private long id;

    private Order order;

    private Date dateOfCompletion;

    *//**
     * get the date of completion.
     * @return the date of completion.*//*
    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_completion", nullable = false)
    public Date getDateOfCompletion() {
        return dateOfCompletion;
    }

    *//**
     * get the order which is completed.
     * @return the completed order*//*
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "order_tracking_no", nullable = false)
    public Order getOrder() {
        return order;
    }

    *//**
     * set the completed order.
     * @param order the completed order*//*
    public void setOrder(Order order) {
        this.order = order;
    }*/
}
