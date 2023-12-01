package threadpackage02;

public class Tack01 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class MyMain {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Tack01(), "线程一");
        Thread thread2 = new Thread(new Tack01(), "线程二");
        Thread thread3 = new Thread(new Tack01(), "线程三");
        thread1.start();
        thread2.start();
        thread3.start();

        for (int i = 1; i <= 100; i++) {
            System.out.println("我是主线程");
            Thread.sleep(120);
        }

    }


}
