package threadpackage01;

public class Tack01 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("一号任务：" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Tack02 extends Thread {
    @Override
    public void run() {
        for (int i = 100; i >= 1; i--) {
            System.out.println("二号任务：" + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class MyMain {
    public static void main(String[] args) throws InterruptedException {
        Tack01 t1 = new Tack01();
        t1.start();
        Tack02 t2 = new Tack02();
        t2.start();
        for (int i = 1; i <= 100; i++) {
            System.out.println("我是主线程");
            Thread.sleep(120);
        }

    }


}
