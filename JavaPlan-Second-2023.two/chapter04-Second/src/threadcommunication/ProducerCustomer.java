package threadcommunication;
//案例二：生产者&消费者
//        生产者(Producer)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，店员一次只能持有
//        固定数量的产品(比如:20)，如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品
//        了再通知生产者继续生产，如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来
//        取走产品


/*
分析：
1.是否是多线程问题：是，生产者，消费者
2.是否有共享数据：有，产品
3.是否有线程安全问题：有 有共享数据
4.是否需要处理线程安全问题：同步机制
5.是否存在线程通信：存在

*/

public class ProducerCustomer {
    public static void main(String[] args) {

        Clerk clerk1 = new Clerk();
        Producer pro1 = new Producer(clerk1);
        Customer cust1 = new Customer(clerk1);
        Customer cust2 = new Customer(clerk1);
        pro1.setName("生产者1");
        cust1.setName("消费者1");
        cust2.setName("消费者2");
        pro1.start();
        cust1.start();
        cust2.start();

    }
}

class Clerk {//店员
    private int productnum = 0; //产品数量

    //增加产品数量方法
    public synchronized void Add() {
        if (productnum >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            productnum++;
            System.out.println(Thread.currentThread().getName() + "生产了第" + productnum + "个产品");
            notifyAll();
        }
    }

    //减少产品数量方法
    public synchronized void Min() {
        if (productnum <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "消费了第" + productnum + "个产品");
            productnum--;
            notifyAll();
        }
    }

}

class Producer extends Thread {//生产者

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public synchronized void run() {
        while (true) {
            System.out.println("生产者开始生产产品");
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.Add();
        }
    }
}

class Customer extends Thread {//消费者
    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public synchronized void run() {
        while (true) {
            System.out.println("消费者开始消费产品");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.Min();
        }
    }

}
