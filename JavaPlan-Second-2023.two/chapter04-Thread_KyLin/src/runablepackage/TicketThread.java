package runablepackage;

public class TicketThread implements Runnable {
    private int tickets = 1000;
    public boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            show();
        }
    }

    public synchronized void show() {
        if (tickets > 0) {
            try {
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName() + "卖出第" + tickets + "票");
                tickets--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "票已买完");
            isFlag = false;
        }
    }
}

class TicketsMain {
    public static void main(String[] args) {
        TicketThread ticketThread = new TicketThread();
        new Thread(ticketThread, "窗口一").start();
        new Thread(ticketThread, "窗口二").start();
        new Thread(ticketThread, "窗口三").start();
        new Thread(ticketThread, "窗口四").start();
    }

}