import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
    private Connection connection;
    public Connection getConnection() {
        return connection;
    }

    public GetConnection(String dbname) throws ClassNotFoundException, SQLException {
        try {
            // 加载MySQL驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            String url = BaseInfo.URL + dbname;
            connection = DriverManager.getConnection(url, BaseInfo.USERNAME, BaseInfo.PASSWORD);
            this.connection = connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            this.connection = null;
        } catch (SQLException e) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            String url = BaseInfo.URL + "mysql";
            connection = DriverManager.getConnection(url, BaseInfo.USERNAME, BaseInfo.PASSWORD);
            this.connection = connection;
        }

    }
}
