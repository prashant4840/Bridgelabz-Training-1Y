public abstract class Checkpoint {

    protected String checkpointId;
    protected String locationName;
    protected double distanceFromLast;
    protected double expectedDuration;
    protected double actualDuration;

    public Checkpoint() {}

    public Checkpoint(String checkpointId, String locationName,
                      double distanceFromLast,
                      double expectedDuration, double actualDuration) {
        this.checkpointId = checkpointId;
        this.locationName = locationName;
        this.distanceFromLast = distanceFromLast;
        this.expectedDuration = expectedDuration;
        this.actualDuration = actualDuration;
    }

    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double calculatePenalty();


    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public double getDelay() {
        return Math.max(0, actualDuration - expectedDuration);
    }

    public String getCheckpointId() { return checkpointId; }
    public void setCheckpointId(String id) { this.checkpointId = id; }

    public String getLocationName() { return locationName; }
    public void setLocationName(String name) { this.locationName = name; }

    public double getDistanceFromLast() { return distanceFromLast; }
    public void setDistanceFromLast(double d) { this.distanceFromLast = d; }

    public double getExpectedDuration() { return expectedDuration; }
    public void setExpectedDuration(double d) { this.expectedDuration = d; }

    public double getActualDuration() { return actualDuration; }
    public void setActualDuration(double d) { this.actualDuration = d; }


    @Override
    public String toString() {
        return String.format("%s – %s – %s – Penalty: %.1f",
                getType(), locationName,
                isDelayed() ? "Delayed" : "On Time",
                calculatePenalty());
    }
}

