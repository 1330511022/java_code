package threadsafe.SafeSecond;

//使用同步方法解决实现Thread继承的线程安全问题
//Thread继承的方式
public class WindowTest01 {
    public static void main(String[] args) {
        SaleTicket2 t1 = new SaleTicket2();
        SaleTicket2 t2 = new SaleTicket2();
        SaleTicket2 t3 = new SaleTicket2();

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();

    }
}

class SaleTicket2 extends Thread {
    static int ticket2 = 100; //将ticket定义为静态的 防止每个对象接口都调用100张票
    static Object obj = new Object();
    static boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            show();
        }
    }
//    public synchronized void show() {//此时同步监视器为this 此题目中this为t1,t2,t3 非唯一 仍然是线程不安全的
    public static synchronized void show() {//此时同步监视器为当前类本身，即为SaleTicket2.class 是唯一的
        if (ticket2 > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket2);
            ticket2--;

        } else {
            isFlag = false;
        }

    }
}
