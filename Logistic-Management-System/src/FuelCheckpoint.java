class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String loc, double dist, int expected, int actual) {
        super(id, loc, dist, expected, actual);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "FuelCheckpoint";
    }

    double calculatePenalty() {
        if (isDelayed()) {
            return 10;
        }
        return 0;
    }
}