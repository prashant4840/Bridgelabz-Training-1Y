import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

    public static void close(ResultSet rs) {
        if (rs != null) {
            try { rs.close(); } catch (SQLException ignored) {}
        }
    }


    public static void close(PreparedStatement ps) {
        if (ps != null) {
            try { ps.close(); } catch (SQLException ignored) {}
        }
    }


    public static void close(PreparedStatement ps, ResultSet rs) {
        close(rs);
        close(ps);
    }


    public static void rollback(Connection conn) {
        if (conn != null) {
            try { conn.rollback(); } catch (SQLException ignored) {}
        }
    }
}