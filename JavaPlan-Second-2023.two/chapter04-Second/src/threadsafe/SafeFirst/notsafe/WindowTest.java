package threadsafe.SafeFirst.notsafe;
//例题：开启三个窗口卖票，总票数为100张 防止出现错票,重票等一系列安全操作
//使用Runnable接口的方式
public class WindowTest {
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



class SaleTicket implements Runnable{
    int ticket = 100;
    @Override
    public void run() {
        while (true){

            if (ticket>0){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+"售票，票号为"+ticket);
                ticket--;
            }else {
                break;
            }
        }


    }
}