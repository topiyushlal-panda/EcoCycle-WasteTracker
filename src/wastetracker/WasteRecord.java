package wastetracker;

/**
 * A waste item the user has logged. Every record is either RecyclableWaste
 * or GeneralWaste, so this class is abstract.
 */
public abstract class WasteRecord {

    private String itemName;
    private String category;
    private int quantity;
    private String disposalMethod;

    public WasteRecord(String itemName, String category, int quantity, String disposalMethod) {
        this.itemName = itemName;
        this.category = category;
        this.quantity = quantity;
        this.disposalMethod = disposalMethod;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDisposalMethod() {
        return disposalMethod;
    }

    public void setDisposalMethod(String disposalMethod) {
        this.disposalMethod = disposalMethod;
    }

    // Each type of waste gives its own advice on how to get rid of it
    public abstract String getDisposalAdvice();

    // One line of text used when saving the record to a file
    public abstract String toFileString();

    @Override
    public String toString() {
        return itemName + " x" + quantity + " (" + category + ") - " + disposalMethod;
    }
}
