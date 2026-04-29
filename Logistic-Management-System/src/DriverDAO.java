import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DriverDAO {

    private final Connection connection;

    public DriverDAO() {
        this.connection = DBConnection.getConnection();
    }

    public boolean addDriver(Driver driver) {
        String sql = "INSERT INTO drivers (driver_id, name) VALUES (?, ?)";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, driver.getDriverId());
            ps.setString(2, driver.getName());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("[DAO] addDriver error: " + e.getMessage());
            return false;
        } finally {
            DBUtil.close(ps);
        }
    }

    public List<Driver> getAllDrivers() {
        List<Driver> list = new ArrayList<>();
        String sql = "SELECT * FROM drivers ORDER BY driver_id";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Driver(rs.getString("driver_id"),
                        rs.getString("name")));
            }
        } catch (SQLException e) {
            System.err.println("[DAO] getAllDrivers error: " + e.getMessage());
        } finally {
            DBUtil.close(ps, rs);
        }
        return list;
    }

    public Driver getDriverById(String driverId) {
        String sql = "SELECT * FROM drivers WHERE driver_id = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, driverId);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Driver(rs.getString("driver_id"),
                        rs.getString("name"));
            }
        } catch (SQLException e) {
            System.err.println("[DAO] getDriverById error: " + e.getMessage());
        } finally {
            DBUtil.close(ps, rs);
        }
        return null;
    }

    public boolean updateDriver(Driver driver) {
        String sql = "UPDATE drivers SET name = ? WHERE driver_id = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, driver.getName());
            ps.setString(2, driver.getDriverId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("[DAO] updateDriver error: " + e.getMessage());
            return false;
        } finally {
            DBUtil.close(ps);
        }
    }


    public boolean deleteDriver(String driverId) {
        String sql = "DELETE FROM drivers WHERE driver_id = ?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, driverId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("[DAO] deleteDriver error: " + e.getMessage());
            return false;
        } finally {
            DBUtil.close(ps);
        }
    }
}
