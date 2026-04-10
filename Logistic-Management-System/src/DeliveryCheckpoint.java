class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String loc, double dist, int expected, int actual) {
        super(id, loc, dist, expected, actual);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "DeliveryCheckpoint";
    }

    double calculatePenalty() {
        if (isDelayed()) {
            return (actualDuration - expectedDuration) * 2;
        }
        return 0;
    }
}