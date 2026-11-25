package wastetracker;

/**
 * Waste that cannot be recycled. Some of it can be hazardous.
 */
public class GeneralWaste extends WasteRecord {

    private boolean hazardous;

    public GeneralWaste(String itemName, int quantity, String disposalMethod, boolean hazardous) {
        super(itemName, "General", quantity, disposalMethod);
        this.hazardous = hazardous;
    }

    public boolean isHazardous() {
        return hazardous;
    }

    public void setHazardous(boolean hazardous) {
        this.hazardous = hazardous;
    }

    @Override
    public String getDisposalAdvice() {
        if (hazardous) {
            return "This item is hazardous. Bring it to a civic amenity site, not your bin.";
        }
        return "Put this item in your general waste bin.";
    }

    @Override
    public String toFileString() {
        return "GENERAL|" + getItemName() + "|" + getQuantity() + "|" + getDisposalMethod()
                + "|" + hazardous;
    }
}
