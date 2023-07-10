package bussiness_objects;

public record ItemLocation(String stackRow, String stackColumn) {


    public ItemLocation(String stackRow, String stackColumn) {
        this.stackRow = stackRow;
        this.stackColumn = stackColumn;
    }

    @Override
    public String stackRow() {
        return stackRow;
    }

    @Override
    public String stackColumn() {
        return stackColumn;
    }
}
