package persistent_objects;

import javax.persistence.*;

/**
 * a class to simulate an inventory.
 * @author kamar baraka*/

@Entity
public class ItemInventory {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Column(name = "count", nullable = false)
    private int count;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "item_location_id", nullable = false)
    private ItemLocation itemLocation;

    public ItemLocation getItemLocation() {
        return itemLocation;
    }

    public void setItemLocation(ItemLocation itemLocation) {
        this.itemLocation = itemLocation;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
