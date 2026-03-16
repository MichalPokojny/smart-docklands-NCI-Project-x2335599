
package smartwaste.model;

public abstract class SmartWaste {
    protected String binID;
    protected String location;
    protected int fillLevel;
    protected String status;

    public SmartWaste(String binID, String location, int fillLevel, String status) {
        this.binID = binID;
        this.location = location;
        this.fillLevel = fillLevel;
        this.status = status;
    }

    public String getBinID() { return binID; }
    public String getLocation() { return location; }
    public int getFillLevel() { return fillLevel; }
    public String getStatus() { return status; }
    public void setFillLevel(int fillLevel) { this.fillLevel = fillLevel; }

    // Abstract method - each subclass implements differently (polymorphism)
    public abstract int getCollectionPriority();

    public String toString() {
        return binID + " | " + location + " | " + fillLevel + "% | " + status;
    }
}
