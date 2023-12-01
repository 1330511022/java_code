package API.HomeWork_API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) throws ParseException {
        Book book = new Book();
        Scanner in = new Scanner(System.in);
        System.out.print("请输入书名：");
        book.setBookname(in.next());
        System.out.print("请输入书籍作者：");
        book.setAuthor(in.next());
        System.out.print("请输入书籍价钱：");
        book.setBookprice(in.nextDouble());
        System.out.print("请输入出版日期：(输入格式为：XXXX-X)");
        book.setPublishdate(in.next());
        System.out.print("请输入出版社：");
        book.setPublisher(in.next());
        String date = book.getPublishdate();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM" );
        Date parse = df.parse(date);
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy年MM月");
        book.str2 = df1.format(parse);
        book.say();
    }
}
