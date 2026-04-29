import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CheckpointDAO {

    private final Connection connection;

    public CheckpointDAO() {
        this.connection = DBConnection.getConnection();
    }

    public boolean addCheckpoint(String driverId, Checkpoint cp) {
        String sql = "INSERT INTO checkpoints " +
                "(checkpoint_id, driver_id, location_name, checkpoint_type, " +
                " distance_from_last, expected_duration, actual_duration, is_critical) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, cp.getCheckpointId());
            ps.setString(2, driverId);
            ps.setString(3, cp.getLocationName());
            ps.setString(4, cp.getType().replace("Checkpoint", "").toUpperCase());
            ps.setDouble(5, cp.getDistanceFromLast());
            ps.setDouble(6, cp.getExpectedDuration());
            ps.setDouble(7, cp.getActualDuration());
            ps.setBoolean(8, cp.isCritical());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("[DAO] addCheckpoint error: " + e.getMessage());
            return false;
        } finally {
            DBUtil.close(ps);
        }
    }

    public List<Checkpoint> getCheckpointsByDriver(String driverId) {
        List<Checkpoint> list = new ArrayList<>();
        String sql = "SELECT * FROM checkpoints WHERE driver_id = ? " +
                "ORDER BY checkpoint_id";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, driverId);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(mapRow(rs));
            }
        } catch (SQLException e) {
            System.err.println("[DAO] getCheckpointsByDriver error: " + e.getMessage());
        } finally {
            DBUtil.close(ps, rs);
        }
        return list;
    }

    public Checkpoint getCheckpointById(String checkpointId) {
        String sql = "SELECT * FROM checkpoints WHERE checkpoint_id = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, checkpointId);
            rs = ps.executeQuery();
            if (rs.next()) return mapRow(rs);
        } catch (SQLException e) {
            System.err.println("[DAO] getCheckpointById error: " + e.getMessage());
        } finally {
            DBUtil.close(ps, rs);
        }
        return null;
    }

    public boolean updateCheckpoint(Checkpoint cp) {
        String sql = "UPDATE checkpoints " +
                "SET location_name=?, distance_from_last=?, " +
                " expected_duration=?, actual_duration=? " +
                "WHERE checkpoint_id=?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, cp.getLocationName());
            ps.setDouble(2, cp.getDistanceFromLast());
            ps.setDouble(3, cp.getExpectedDuration());
            ps.setDouble(4, cp.getActualDuration());
            ps.setString(5, cp.getCheckpointId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("[DAO] updateCheckpoint error: " + e.getMessage());
            return false;
        } finally {
            DBUtil.close(ps);
        }
    }


    public boolean deleteCheckpoint(String checkpointId) {
        String sql = "DELETE FROM checkpoints WHERE checkpoint_id = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, checkpointId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("[DAO] deleteCheckpoint error: " + e.getMessage());
            return false;
        } finally {
            DBUtil.close(ps);
        }
    }

    public boolean deleteCheckpointsByDriver(String driverId) {
        String sql = "DELETE FROM checkpoints WHERE driver_id = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, driverId);
            return ps.executeUpdate() >= 0;
        } catch (SQLException e) {
            System.err.println("[DAO] deleteCheckpointsByDriver error: " + e.getMessage());
            return false;
        } finally {
            DBUtil.close(ps);
        }
    }

    private Checkpoint mapRow(ResultSet rs) throws SQLException {
        String type = rs.getString("checkpoint_type");
        String checkpointId = rs.getString("checkpoint_id");
        String locationName = rs.getString("location_name");
        double distanceFromLast = rs.getDouble("distance_from_last");
        double expectedDuration = rs.getDouble("expected_duration");
        double actualDuration = rs.getDouble("actual_duration");

        switch (type) {
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
                throw new SQLException("Unknown checkpoint type: " + type);
        }
    }
}
