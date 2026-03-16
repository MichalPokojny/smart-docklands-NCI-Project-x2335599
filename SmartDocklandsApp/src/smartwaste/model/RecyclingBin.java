
package smartwaste.model;

public class RecyclingBin extends SmartWaste {
    private String recycleCategory;

    public RecyclingBin(String binID, String location, 
                        int fillLevel, String status, String recycleCategory) {
        super(binID, location, fillLevel, status);
        this.recycleCategory = recycleCategory;
    }

    // lower priority than general waste
    public int getCollectionPriority() { return fillLevel - 10; }

    public String toString() {
        return super.toString() + " | Recycling | " + recycleCategory;
    }
}
