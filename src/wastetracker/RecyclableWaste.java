package wastetracker;

/**
 * Waste that can be recycled, such as plastic, paper or glass.
 */
public class RecyclableWaste extends WasteRecord {

    private String materialType;
    private String recyclingBin;

    public RecyclableWaste(String itemName, int quantity, String disposalMethod,
                           String materialType, String recyclingBin) {
        super(itemName, "Recyclable", quantity, disposalMethod);
        this.materialType = materialType;
        this.recyclingBin = recyclingBin;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getRecyclingBin() {
        return recyclingBin;
    }

    public void setRecyclingBin(String recyclingBin) {
        this.recyclingBin = recyclingBin;
    }

    @Override
    public String getDisposalAdvice() {
        return "Rinse the " + materialType.toLowerCase() + " and put it in the " + recyclingBin + ".";
    }

    @Override
    public String toFileString() {
        return "RECYCLABLE|" + getItemName() + "|" + getQuantity() + "|" + getDisposalMethod()
                + "|" + materialType + "|" + recyclingBin;
    }
}
