public class RestCheckpoint extends Checkpoint {

    public RestCheckpoint() { super(); }

    public RestCheckpoint(String checkpointId, String locationName,
                          double distanceFromLast,
                          double expectedDuration, double actualDuration) {
        super(checkpointId, locationName, distanceFromLast,
                expectedDuration, actualDuration);
    }

    @Override
    public boolean isCritical() { return false; }

    @Override
    public String getType() { return "RestCheckpoint"; }

    @Override
    public double calculatePenalty() {
        if (getDelay() > 30.0) {
            return getDelay() * 0.5;
        }
        return 0.0;
    }
}
