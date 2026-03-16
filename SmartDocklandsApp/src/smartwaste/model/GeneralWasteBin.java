
package smartwaste.model;

public class GeneralWasteBin extends SmartWaste {
    private String wasteType;

    public GeneralWasteBin(String binID, String location, 
                           int fillLevel, String status, String wasteType) {
        super(binID, location, fillLevel, status);
        this.wasteType = wasteType;
    }

    // Polymorphism - overrides parent method
    public int getCollectionPriority() { return fillLevel; }

    public String toString() {
        return super.toString() + " | General | " + wasteType;
    }
}