abstract class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast;
    int expectedDuration;
    int actualDuration;

    public Checkpoint(String id, String loc, double dist, int expected, int actual) {
        this.checkpointId = id;
        this.locationName = loc;
        this.distanceFromLast = dist;
        this.expectedDuration = expected;
        this.actualDuration = actual;}

    boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    abstract boolean isCritical();
    abstract String getType();
    abstract double calculatePenalty();
}