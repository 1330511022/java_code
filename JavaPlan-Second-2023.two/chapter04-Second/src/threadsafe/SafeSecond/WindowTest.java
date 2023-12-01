package threadsafe.SafeSecond;

//使用同步方法解决实现Runnable接口的线程安全问题
//Runnable接口的方式

public class WindowTest {
    public static void main(String[] args) {
        SaleTicket s1 = new SaleTicket();

        Thread thread1 = new Thread(s1);
        Thread thread2 = new Thread(s1);
        Thread thread3 = new Thread(s1);

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
    boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {

            show();
        }
    }

        public synchronized void show() { //此时的同步监视器就是：this 此题目中即为s1,是唯一的
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "售票，票号为" + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }
}
