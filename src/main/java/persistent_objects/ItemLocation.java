package persistent_objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * a record to represent an item location.
 * @author kamar baraka*/

@Entity
public class ItemLocation{

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "stack_row", nullable = false)
    private int stackRow;

    @Column(name = "stack_column", nullable = false)
    private int stackColumn;

    public int getStackColumn() {
        return stackColumn;
    }

    public void setStackColumn(int stackColumn) {
        this.stackColumn = stackColumn;
    }

    public int getStackRow() {
        return stackRow;
    }

    public void setStackRow(int stackRow) {
        this.stackRow = stackRow;
    }
}