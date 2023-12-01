package afterclassexer;

public class CountDown {
    public static void main(String[] args) {
        Thread thread = new Thread(new CountdownTask());
        thread.start();
    }

}

class CountdownTask implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("倒计时：" + i + "秒");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("倒计时结束！");
    }
}


