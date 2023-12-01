package threadcommunication;

//案例：使用两个线程打印 1-100 线程1，线程2 交替打印
public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber();
        Thread t1 = new Thread(p, "线程1");
        Thread t2 = new Thread(p, "线程2");
        t1.start();
        t2.start();

    }

}

class PrintNumber implements Runnable {
    Object obj = new Object();
    private int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                obj.notify();
                if (number <= 100) {
                    try {
                        Thread.sleep(15);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                    try {
                        obj.wait();//线程一旦执行此方法就进入阻塞状态，同时会释放对同步监视器的调用
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }

            }
        }
    }
}
