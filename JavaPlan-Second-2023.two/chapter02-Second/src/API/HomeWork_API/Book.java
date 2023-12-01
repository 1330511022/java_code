package API.HomeWork_API;

public class Book {
     public String str2;
    private String bookname;
    private double bookprice;
    private String author;
    private String publisher;
    private String publishdate;

    public String date;
    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public double getBookprice() {
        return bookprice;
    }

    public void setBookprice(double bookprice) {
        this.bookprice = bookprice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }

    public void say(){
        System.out.println("书籍信息为下：");
        System.out.println("书名：《"+this.getBookname()+"》");
        System.out.println("单价：￥"+this.getBookprice());
        System.out.println("作者："+ this.getAuthor());
        System.out.println("出版社："+this.getPublisher());
        System.out.println("出版时间为："+str2);
    }

}
