package threadsafe.SafeFirst.safe;

//使用Thread继承的方式
//使用同步代码块解决上述卖票中的线程安全问题
public class WindowTest02 {
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
    static Object obj = new Object();//用static修饰后，就能保证其唯一性

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (SaleTicket2.class) {//结构：Class clz= SaleTicket2.class
                if (ticket2 > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket2);
                    ticket2--;

                } else {
                    break;
                }
            }

        }
    }
}
