package persistent_objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class Item {
    @Id
    @GeneratedValue
    private long id;
    private String itemName;
    private final int serialNumber = new Random().nextInt(100000, 1000000);
    private double price;


    public Item() {
    }

    public Item(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

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
