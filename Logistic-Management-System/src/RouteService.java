import java.util.List;
public class RouteService {

    private final RouteRepository repository;

    public RouteService() {
        this.repository = new RouteRepository();
    }

    public boolean registerDriver(String driverId, String name) {
        Driver existing = repository.fetchDriverWithRoute(driverId);
        if (existing != null) {
            System.out.println("[Service] Driver " + driverId + " already exists.");
            return false;
        }
        Driver driver = new Driver(driverId, name);
        boolean saved = repository.saveDriver(driver);
        if (saved) System.out.println("[Service] Driver registered: " + driverId);
        return saved;
    }

    public boolean updateDriverName(String driverId, String newName) {
        Driver driver = repository.fetchDriverWithRoute(driverId);
        if (driver == null) {
            System.out.println("[Service] Driver not found: " + driverId);
            return false;
        }
        driver.setName(newName);
        return repository.updateDriver(driver);
    }

    public boolean removeDriver(String driverId) {
        return repository.deleteDriver(driverId);
    }

    public List<Driver> getAllDrivers() {
        return repository.fetchAllDrivers();
    }

    public boolean addCheckpointToDriver(String driverId,
                                         String checkpointId,
                                         String locationName,
                                         String type,
                                         double distanceFromLast,
                                         double expectedDuration,
                                         double actualDuration) {

        Driver driver = repository.fetchDriverWithRoute(driverId);
        if (driver == null) {
            System.out.println("[Service] Driver not found: " + driverId);
            return false;
        }

        Checkpoint cp = createCheckpoint(type, checkpointId, locationName,
                distanceFromLast, expectedDuration, actualDuration);
        if (cp == null) {
            System.out.println("[Service] Unknown checkpoint type: " + type);
            return false;
        }

        boolean saved = repository.saveCheckpoint(driverId, cp);
        if (saved) System.out.println("[Service] Checkpoint added: " + checkpointId);
        return saved;
    }

    public boolean updateCheckpointDetails(String checkpointId,
                                           String newLocationName,
                                           double newExpectedDuration,
                                           double newActualDuration) {
        Checkpoint cp = repository.fetchCheckpoint(checkpointId);
        if (cp == null) {
            System.out.println("[Service] Checkpoint not found: " + checkpointId);
            return false;
        }
        cp.setLocationName(newLocationName);
        cp.setExpectedDuration(newExpectedDuration);
        cp.setActualDuration(newActualDuration);
        return repository.updateCheckpoint(cp);
    }

    public boolean removeCheckpoint(String checkpointId) {
        return repository.deleteCheckpoint(checkpointId);
    }


    public void printRouteSummary(String driverId) {
        Driver driver = repository.fetchDriverWithRoute(driverId);
        if (driver == null) {
            System.out.println("[Service] Driver not found: " + driverId);
            return;
        }

        RouteLinkedList<Checkpoint> route = driver.getRouteHistory();

        System.out.println("============================================");
        System.out.println(driver);
        System.out.println("Route Summary:");
        route.printRoute();

        double totalDistance = route.computeTotalDistance();
        double totalPenalty = route.computeTotalPenalty();
        double routeScore = totalDistance - totalPenalty;

        System.out.printf("Total Distance: %.1f km%n", totalDistance);
        System.out.printf("Total Penalty : %.1f%n", totalPenalty);
        System.out.printf("Route Score : %.1f%n", routeScore);

        boolean consistent = route.isConsistent();
        System.out.println("Critical Route Check: " +
                (consistent
                        ? "All required checkpoints present"
                        : "WARNING – Missing critical checkpoints!"));
        System.out.println("============================================");
    }

    public Checkpoint findCheckpointInRoute(String driverId, String checkpointId) {
        Driver driver = repository.fetchDriverWithRoute(driverId);
        if (driver == null) return null;
        return driver.getRouteHistory().findCheckpoint(checkpointId);
    }

    public double computeRouteScore(String driverId) {
        Driver driver = repository.fetchDriverWithRoute(driverId);
        if (driver == null) return -1;
        return driver.getRouteScore();
    }

    public boolean checkRouteConsistency(String driverId) {
        Driver driver = repository.fetchDriverWithRoute(driverId);
        if (driver == null) return false;
        return driver.getRouteHistory().isConsistent();
    }

    private Checkpoint createCheckpoint(String type,
                                        String checkpointId, String locationName,
                                        double distanceFromLast,
                                        double expectedDuration, double actualDuration) {
        switch (type.trim().toUpperCase()) {
            case "DELIVERY":
                return new DeliveryCheckpoint(checkpointId, locationName,
                        distanceFromLast, expectedDuration, actualDuration);
            case "FUEL":
                return new FuelCheckpoint(checkpointId, locationName,
                        distanceFromLast, expectedDuration, actualDuration);
            case "REST":
                return new RestCheckpoint(checkpointId, locationName,
                        distanceFromLast, expectedDuration, actualDuration);
            default:
                return null;
        }
    }
}
