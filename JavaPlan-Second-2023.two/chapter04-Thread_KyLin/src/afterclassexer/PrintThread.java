package afterclassexer;

public class PrintThread {
    boolean flag = true;
    int count = 1;

    public synchronized void printnumber() throws InterruptedException {
        while (!flag) {
            this.wait();
        }
        System.out.println(count * 2 - 1);
        System.out.println(count * 2);
        flag = false;
        this.notify();
    }

    public synchronized void printchar() throws InterruptedException {
        while (flag) {
            this.wait();
        }
        System.out.println((char) count + 'A' - 1);
        count++;
        flag = true;
        this.notify();
    }

}

class Main {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 26; i++) {
                    try {
                        printThread.printnumber();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 26; i++) {
                    try {
                        printThread.printchar();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();


    }


}