package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class demo02 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String URL = "jdbc:mysql://localhost:3306/test";
        String USERNAME = "root";
        String PASSWORD = "297592781";

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String user = scanner.next();
        System.out.println("请输入密码");
        String passwd = scanner.next();
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement statement = connection.createStatement();
        String sql = "select username,password from login";
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        if (user.equals(resultSet.getString("username"))&& passwd.equals(resultSet.getString("password"))){
            System.out.println("密码正确");
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
