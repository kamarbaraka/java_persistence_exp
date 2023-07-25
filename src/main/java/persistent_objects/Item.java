package persistent_objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Random;

/**
 * a class to simulate an item.
 * @author kamar baraka*/

@Entity
public class Item {
    @Id
    @GeneratedValue
    private long id;
    private String itemName;
    private final int serialNumber = new Random().nextInt(100000, 1000000);
    private double price;



    /**
     * no-argument constructor*/
    public Item() {
    }

    /**
     * construct an item.
     * @param itemName the name of the item.
     * @param price the price of the item.*/
    public Item(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    /**
     * get the name of the item.
     * @return the name of the item*/
    public String getItemName() {
        return itemName;
    }

    /**
     * set the name of the item.*/
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * get the price of the item.
     * @return the price of the item*/
    public double getPrice() {
        return price;
    }

    /**
     * sets the price of the item*/
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", serialNumber=" + serialNumber +
                ", price=" + price +
                '}';
    }
}
