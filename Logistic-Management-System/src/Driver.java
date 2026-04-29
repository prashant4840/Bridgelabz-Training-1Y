public class Driver {

    private String driverId;
    private String name;
    private RouteLinkedList<Checkpoint> routeHistory;

    public Driver() {
        this.routeHistory = new RouteLinkedList<>();
    }

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public double getRouteScore() {
        double totalDistance = routeHistory.computeTotalDistance();
        double totalPenalty = routeHistory.computeTotalPenalty();
        return totalDistance - totalPenalty;
    }

    public String getDriverId() { return driverId; }
    public void setDriverId(String id) { this.driverId = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public RouteLinkedList<Checkpoint> getRouteHistory() { return routeHistory; }
    public void setRouteHistory(RouteLinkedList<Checkpoint> rh) { this.routeHistory = rh; }

    @Override
    public String toString() {
        return "Driver: " + driverId + " – " + name;
    }
}

