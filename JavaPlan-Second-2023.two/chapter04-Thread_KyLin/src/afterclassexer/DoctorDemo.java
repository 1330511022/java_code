package afterclassexer;

public class DoctorDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "开始诊断第" + i + "个病人");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class WindowMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new DoctorDemo(), "专家号医生");
        thread.start();
        thread.setPriority(Thread.MAX_PRIORITY);
        for (int i = 1; i <= 20; i++) {
            System.out.println("普通号医生开始诊断第" + i + "个病人");
            try {
                Thread.sleep(500);
                if (i == 10) {
                    thread.join();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}