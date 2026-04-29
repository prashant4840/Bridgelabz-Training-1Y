public class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint() { super(); }

    public FuelCheckpoint(String checkpointId, String locationName,
                          double distanceFromLast,
                          double expectedDuration, double actualDuration) {
        super(checkpointId, locationName, distanceFromLast,
                expectedDuration, actualDuration);
    }

    @Override
    public boolean isCritical() { return true; }

    @Override
    public String getType() { return "FuelCheckpoint"; }

    @Override
    public double calculatePenalty() {
        return isDelayed() ? 10.0 : 0.0;
    }
}

