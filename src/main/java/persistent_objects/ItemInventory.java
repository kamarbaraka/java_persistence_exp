package persistent_objects;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
public class ItemInventory {

    @Id
    @GeneratedValue
    private long id;

    private Item item;

}
