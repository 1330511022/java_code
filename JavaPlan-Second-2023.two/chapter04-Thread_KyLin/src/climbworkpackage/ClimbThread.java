package climbworkpackage;

public class ClimbThread implements Runnable {
    private int time; //爬100m的需要时间，以毫秒为单位
    private int num;//表示要爬多少个100m
    Object lock = new Object();

    @Override
    public void run() {
        int count = 0; //走的第几个100m
            while (count < this.num) {
                try {
                    Thread.sleep(this.time); //模仿爬山的过程
                    count++;
                    System.out.println(Thread.currentThread().getName() + "爬了" + count * 100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + "登顶!");
        }

    public ClimbThread(int t, int height) {
        this.time = t * 1000;
        this.num = height / 100;
    }
}

class ClimbMain {
    public static void main(String[] args) {
        new Thread(new ClimbThread(2, 2000), "年轻人").start();
        new Thread(new ClimbThread(5, 2000), "老年人").start();
    }


}
