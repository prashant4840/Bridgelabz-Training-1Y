class Driver {
    String driverId;
    String name;

    public Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
    }

    void printSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");

        double score = distance - penalty;

        System.out.println("Total Distance: " + distance + " km");
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + score);

        System.out.println("Critical Route Check: " + "All required checkpoints present" + "Missing critical checkpoints");
    }
}