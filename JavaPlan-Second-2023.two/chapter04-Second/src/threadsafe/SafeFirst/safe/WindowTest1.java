package threadsafe.SafeFirst.safe;
//使用Runnable的方式
//使用同步代码块解决上述卖票中的线程安全问题
public class WindowTest1 {
    public static void main(String[] args) {
        SaleTicket s = new SaleTicket();

        Thread thread1 = new Thread(s);
        Thread thread2 = new Thread(s);
        Thread thread3 = new Thread(s);

        thread1.setName("窗口一");
        thread2.setName("窗口二");
        thread3.setName("窗口三");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class SaleTicket implements Runnable {
    int ticket = 100;
    Object obj = new Object();
    Dog d1 = new Dog();

    @Override
    public void run()  {
        while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //obj是唯一的？yes
            //d1是唯一的？yes
            //this是唯一的？yes 就是题目中的s
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售票，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }

    }
}

class Dog {
}
