import java.sql.SQLException;
import java.util.Scanner;

public class CreateMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String dbname = "test";
        Scanner in = new Scanner(System.in);
        System.out.println("请选择生成测试数据库还是正式数据库？（1: 测试数据库中有两个表; 2:正式数据库中包含3个表，且有外键关系。）");
        try {
            int choose = in.nextInt();
            if(choose != 1 && choose != 2){
                System.out.println("输入错误，重新输入！");
                return;
            }else if (choose == 1){
                dbname = "test";
            }else{
                System.out.println("请输入你的姓名拼音的全拼，正式数据库将以你的名字命名：");
                dbname = in.next();
            }
        }catch (Exception e){
            System.out.println("输入错误，重新运行程序再输入！");
        }
        System.out.println("请稍后....");
        CreateDatabase cd = new CreateDatabase();
        if(cd.createDatabase(dbname)){
            CreateTable ct = new CreateTable();
            ct.createTable(dbname);
        }
        System.out.println("数据库和数据表创建成功！数据库名称为：" + dbname);
     }
}

