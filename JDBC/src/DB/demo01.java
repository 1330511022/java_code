package DB;

import java.sql.*;

public class demo01 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String URL = "jdbc:mysql://localhost:3306/test";
        String USERNAME = "root";
        String PASSWORD = "297592781";
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        String sql = "select name,city from users where id = 1 values(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "郑十");
        preparedStatement.setString(2, "天津");
        int i = preparedStatement.executeUpdate();
        if (i>0){
            System.out.println("有此人");
        }else {
            System.out.println("无此人");
        }

//        int id = 0;
//        String email = null;
//        String name = null;
//        String city = null;
//        int age = 0;
//        if (resultSet.next()) {
//            System.out.println("成功");
//            id = resultSet.getInt("id");
//            email = resultSet.getString("email");
//            name = resultSet.getString("name");
//            city = resultSet.getString("city");
//            age = resultSet.getInt("age");
//        }
//        System.out.println("id为"+id +"\n邮箱为"+ email +"\n姓名为："+ name +"\n城市为："+  city +"\n年龄为："+  age);
        preparedStatement.close();
//        resultSet.close();
        connection.close();


    }
}
