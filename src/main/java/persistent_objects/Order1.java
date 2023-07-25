package persistent_objects;


import javax.persistence.*;

/**
 *  a class to simulate an order.
 *  @author kamar baraka*/

//@Entity
public class Order1 {

    @Id
    private long trackingNo;

    /*@OneToOne*//*(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, optional = false, orphanRemoval = true)*//*
    @JoinColumn(name = "id")
    private Bill bill;*/

    @Column(name = "satus", nullable = false)
    private String satus;

    /*@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, optional = false, orphanRemoval = true)
    @JoinColumn(name = "bill_id", nullable = false)
    public Bill getBill() {
        return bill;
    }*/

   /* public void setBill(Bill bill) {
        this.bill = bill;
    }*/

    public String getSatus() {
        return satus;
    }

    public void setSatus(String satus) {
        this.satus = satus;
    }


    public long getTrackingNo() {
        return trackingNo;
    }
}
