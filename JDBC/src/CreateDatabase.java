import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
    Connection connection = null;
    public boolean createDatabase(String dbname) throws SQLException, ClassNotFoundException {
        GetConnection conn = new GetConnection(dbname);
        Statement statement = null;
        connection = conn.getConnection();
        try {
            statement = connection.createStatement();
            String sql = "DROP DATABASE IF EXISTS " + dbname + ";";
            statement.executeUpdate(sql);
            sql = "create database " + dbname + ";";
            statement.executeUpdate(sql);
            connection.close();
            return true;
        } catch (SQLException e) {
           return false;
        }

    }
}
