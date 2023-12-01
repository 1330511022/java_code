import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    Connection connection = null;
    public void createTable(String dbname) throws SQLException, ClassNotFoundException {
        if(dbname.equals("test")){
            createTableTestTable(dbname);
        }else{
            createFormalTable(dbname);
        }
    }
    private void createFormalTable(String dbname) throws SQLException, ClassNotFoundException{
        GetConnection conn = new GetConnection(dbname);
        Statement statement = null;
        connection = conn.getConnection();
        statement = connection.createStatement();
        String sql = "CREATE TABLE Students ( " +
                "  student_id INT PRIMARY KEY, " +
                "  student_name VARCHAR(50), " +
                "  student_age INT, " +
                "  student_gender VARCHAR(10)" +
                "); ";
        statement.executeUpdate(sql);
        sql = "CREATE TABLE Courses ( " +
                "  course_id INT PRIMARY KEY, " +
                "  course_name VARCHAR(50), " +
                "  course_teacher VARCHAR(50)" +
                ");  ";
        statement.executeUpdate(sql);
        sql = "CREATE TABLE Grades (  " +
                "  student_id INT,  " +
                "  course_id INT,  " +
                "  grade DECIMAL(4, 2),  " +
                "  FOREIGN KEY (student_id) REFERENCES Students (student_id),  " +
                "  FOREIGN KEY (course_id) REFERENCES Courses (course_id) " +
                ");";
        statement.executeUpdate(sql);
        sql = "INSERT INTO Students (student_id, student_name, student_age, student_gender)  " +
                "VALUES  " +
                "  (1, '张三', 20, '男'),  " +
                "  (2, '李四', 21, '女'),  " +
                "  (3, '王五', 22, '男'),  " +
                "  (4, '赵六', 23, '女'),  " +
                "  (5, '陈七', 20, '男'),  " +
                "  (6, '杨八', 21, '女'),  " +
                "  (7, '周九', 22, '男'),  " +
                "  (8, '吴十', 23, '女'),  " +
                "  (9, '郑十一', 20, '男'),  " +
                "  (10, '何十二', 21, '女');";
        statement.executeUpdate(sql);
        sql = "INSERT INTO Courses (course_id, course_name, course_teacher)  " +
                "VALUES  " +
                "  (1, '数学', '李老师'),  " +
                "  (2, '英语', '王老师'),  " +
                "  (3, '物理', '赵老师'),  " +
                "  (4, '化学', '陈老师'),  " +
                "  (5, '生物', '杨老师'),  " +
                "  (6, '历史', '周老师'),  " +
                "  (7, '地理', '吴老师'),  " +
                "  (8, '政治', '郑老师'),  " +
                "  (9, '音乐', '何老师'),  " +
                "  (10, '美术', '孙老师');";
        statement.executeUpdate(sql);
        sql="INSERT INTO Grades (student_id, course_id, grade)  " +
                "VALUES  " +
                "  (1, 1, 85.5),  " +
                "  (1, 2, 90.0),  " +
                "  (1, 3, 88.0),  " +
                "  (1, 4, 92.5),  " +
                "  (2, 1, 91.5),  " +
                "  (2, 2, 95.0),  " +
                "  (2, 3, 86.5),  " +
                "  (2, 4, 93.5),  " +
                "  (3, 1, 87.5),  " +
                "  (3, 2, 62.0),  " +
                "  (3, 3, 89.5),  " +
                "  (3, 4, 61.5),  " +
                "  (4, 1, 88.5),  " +
                "  (4, 2, 93.0),  " +
                "  (4, 3, 57.5),  " +
                "  (4, 4, 92.5),  " +
                "  (5, 1, 86.5),  " +
                "  (5, 2, 91.0),  " +
                "  (5, 3, 88.5),  " +
                "  (5, 4, 94.0),  " +
                "  (6, 1, 77.0),  " +
                "  (6, 2, 92.5),  " +
                "  (6, 3, 86.0),  " +
                "  (6, 4, 73.5),  " +
                "  (7, 1, 88.0),  " +
                "  (7, 2, 93.5),  " +
                "  (7, 3, 77.5),  " +
                "  (7, 4, 92.0),  " +
                "  (8, 1, 87.5),  " +
                "  (8, 2, 92.0),  " +
                "  (8, 3, 89.2),  " +
                "  (8, 6, 96.3),  " +
                "  (9, 1, 56.6),  " +
                "  (10,2, 45.8);";
        statement.executeUpdate(sql);
        statement.close();
        connection.close();
    }
    private void createTableTestTable(String dbname) throws SQLException, ClassNotFoundException {
        GetConnection conn = new GetConnection(dbname);
        Statement statement = null;
        connection = conn.getConnection();
        statement = connection.createStatement();
        String sql = "CREATE TABLE users ( " +
                "id INT(11) AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(50) NOT NULL, " +
                "email VARCHAR(100) NOT NULL, " +
                "age INT(3) NOT NULL, " +
                "city VARCHAR(50) NOT NULL" +
                ");";
        statement.executeUpdate(sql);
        sql = "CREATE TABLE products (" +
                "id INT(11) AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(100) NOT NULL, " +
                "price DECIMAL(10,2) NOT NULL, " +
                "description TEXT NOT NULL, " +
                "category VARCHAR(50) NOT NULL " +
                ");";
        statement.executeUpdate(sql);
        sql = "INSERT INTO users (name, email, age, city)  " +
                "VALUES  " +
                "('张三', 'zhangsan@example.com', 28, '北京'),  " +
                "('李四', 'lisi@example.com', 35, '上海'),  " +
                "('王五', 'wangwu@example.com', 22, '广州'),  " +
                "('赵六', 'zhaoliu@example.com', 43, '深圳'),  " +
                "('陈七', 'chenqi@example.com', 31, '成都'),  " +
                "('刘八', 'liuba@example.com', 29, '杭州')," +
                "('孙九', 'sunjiu@example.com', 33, '重庆'),  " +
                "('郑十', 'zhengshi@example.com', 40, '天津'),  " +
                "('吴十一', 'wuyishi@example.com', 27, '武汉'),  " +
                "('冯十二', 'fengshi Er@example.com', 36, '成都'),  " +
                "('沈十三', 'shenshi San@example.com', 29, '南京'),  " +
                "('陈二十二', 'chen''Er Er@example.com', 38, '上海');" ;
        statement.executeUpdate(sql);
        sql = "INSERT INTO products (name, price, description, category)  " +
                "VALUES  " +
                "('产品A', 199.00, '这是一款专为需要产品A功能的用户设计的产品。具有多种实用功能，帮助您更方便地完成日常工作。适合所有需要产品A功能的用户。', '类别A'),  " +
                "('产品B', 299.00, '这是一款专为需要产品B功能的用户设计的产品。具有多种实用功能，帮助您更方便地完成日常工作。适合所有需要产品B功能的用户。', '类别B'),  " +
                "('产品C', 399.00, '这是一款专为需要产品C功能的用户设计的产品。具有多种实用功能，帮助您更方便地完成日常工作。适合所有需要产品C功能的用户。', '类别C'),  " +
                "('产品D', 499.00, '这是一款专为需要产品D功能的用户设计的产品。具有多种实用功能，帮助您更方便地完成日常工作。适合所有需要产品D功能的用户。', '类别D'),  " +
                "('产品E', 599.00, '这是一款专为需要产品E功能的用户设计的产品。具有多种实用功能，帮助您更方便地完成日常工作。适合所有需要产品E功能的用户。', '类别E'),   " +
                "('产品X', 899.00, '这是一款专为需要产品X功能的用户设计的产品。具有多种实用功能，帮助您更方便地完成日常工作。适合所有需要产品X功能的用户。', '类别X')," +
                "('产品Y', 229.00, '这是一款专为需要产品Y功能的用户设计的产品。具有多种实用功能，帮助您更方便地完成日常工作。适合所有需要产品Y功能的用户。', '类别Y'),  " +
                "('产品Z', 329.00, '这是一款专为需要产品Z功能的用户设计的产品。具有多种实用功能，帮助您更方便地完成日常工作。适合所有需要产品Z功能的用户。', '类别Z'),  " +
                "('产品AA', 499.00, '这是一款专为需要产品AA功能的用户设计的产品。具有多种实用功能，帮助您更方便地完成日常工作。适合所有需要产品AA功能的用户。', '类别AA'),  " +
                "('产品BB', 599.00, '这是一款专为需要产品BB功能的用户设计的产品。具有多种实用功能，帮助您更方便地完成日常工作。适合所有需要产品BB功能的用户。', '类别BB'),  " +
                "('产品CC', 699.00, '这是一款专为需要产品CC功能的用户设计的产品。具有多种实用功能，帮助您更方便地完成日常工作。适合所有需要产品CC功能的用户。', '类别CC'),  " +
                "('产品WW', 899.00, '这是一款专为需要产品WW功能的用户设计的产品。具有多种实用功能，帮助您更方便地完成日常工作。适合所有需要产品WW功能的用户。', '类别WW');";
        statement.executeUpdate(sql);
        statement.close();
        connection.close();
    }

}
