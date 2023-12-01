package IO.charstreampackage.charstreamproject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class login {
    private static String username;
    private String password;

    public login() {

    }
    public login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean check() {
        if (this.username.equals("stu") && this.password.equals("123456")) {
            return true;

        } else {
            return false;
        }
    }
    public void FileSpeak(int i ) throws IOException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String format = simpleDateFormat.format(date);
        File file = new File("login.log");
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(i + "," + "登录时间为：" + format);
        fileWriter.write(",用户名：" + login.getUsername());
        fileWriter.write("，密码：" + this.getPassword());
        fileWriter.write("\n");
        fileWriter.close();
    }

}
