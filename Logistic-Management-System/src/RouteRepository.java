import java.util.List;
public class RouteRepository {

    private final DriverDAO driverDAO;
    private final CheckpointDAO checkpointDAO;

    public RouteRepository() {
        this.driverDAO = new DriverDAO();
        this.checkpointDAO = new CheckpointDAO();
    }


    public boolean saveDriver(Driver driver) {
        return driverDAO.addDriver(driver);
    }

    public Driver fetchDriverWithRoute(String driverId) {
        Driver driver = driverDAO.getDriverById(driverId);
        if (driver == null) return null;

        List<Checkpoint> checkpoints =
                checkpointDAO.getCheckpointsByDriver(driverId);

        RouteLinkedList<Checkpoint> route = new RouteLinkedList<>();
        for (Checkpoint cp : checkpoints) {
            route.addCheckpoint(cp);
        }
        driver.setRouteHistory(route);
        return driver;
    }

    public List<Driver> fetchAllDrivers() {
        return driverDAO.getAllDrivers();
    }

    public boolean updateDriver(Driver driver) {
        return driverDAO.updateDriver(driver);
    }

    public boolean deleteDriver(String driverId) {
        checkpointDAO.deleteCheckpointsByDriver(driverId);
        return driverDAO.deleteDriver(driverId);
    }


    public boolean saveCheckpoint(String driverId, Checkpoint cp) {
        return checkpointDAO.addCheckpoint(driverId, cp);
    }

    public Checkpoint fetchCheckpoint(String checkpointId) {
        return checkpointDAO.getCheckpointById(checkpointId);
    }

    public boolean updateCheckpoint(Checkpoint cp) {
        return checkpointDAO.updateCheckpoint(cp);
    }

    public boolean deleteCheckpoint(String checkpointId) {
        return checkpointDAO.deleteCheckpoint(checkpointId);
    }
}
