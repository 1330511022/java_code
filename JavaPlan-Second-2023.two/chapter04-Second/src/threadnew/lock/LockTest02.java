package threadnew.lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest02 {
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
    static int ticket2 = 100;
    //1.创建Lock的实例，需要确保多个线程共用同一个Lock实例! 需要考虑将此对象声明为static
    private static final ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true) {
            //2.执行Lock方法，锁定对共享资源的调用
            lock.lock();
            try {
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

            } finally {
                //3.unlock()释放对共享数据的调用
                lock.unlock();

            }


        }
    }
}
