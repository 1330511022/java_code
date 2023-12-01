package threadpackage02;

public class WindowTest extends Thread {
    private int tickets = 100;

    public void run() {
        while(tickets>0) {
            System.out.println(Thread.currentThread().getName() + "正在发售第" + tickets-- + "张票");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(tickets<=0){
            System.out.println(Thread.currentThread().getName() + "票已售完");
        }
    }
}
class Main{
    public static void main(String[] args) {
        WindowTest windowTest = new WindowTest();
        Thread thread1 = new Thread(windowTest, "一号窗口");
        Thread thread2 = new Thread(windowTest, "二号窗口");
        Thread thread3 = new Thread(windowTest, "三号窗口");
        Thread thread4 = new Thread(windowTest, "四号窗口");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }


}
