package threadmethod;


public class Threadmain {
    public static void main(String[] args) throws InterruptedException {
        PrintNumb printNumb = new PrintNumb("子线程一");
//        printNumb.setName("改动后的extends方式线程一");
        printNumb.setPriority(Thread.MIN_PRIORITY);//设置子线程一的优先值为最小
        printNumb.start();
        Thread.currentThread().setName("主线程一");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);//设置主线程的优先值为最大
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() +":" + i+"   " +
                        "优先级为"+Thread.currentThread().getPriority());

            }
//            if (i==20){
//                printNumb.join();
//            }
        }
        System.out.println("子线程一是否存活:"+printNumb.isAlive());
        PrintA printA = new PrintA();
        Thread thread = new Thread(printA,"子线程二");
        thread.setPriority(Thread.NORM_PRIORITY);//设置子线程二的优先值为默认
        thread.start();

    }

}


class PrintNumb extends Thread {
    public PrintNumb(){
    }
    public PrintNumb(String name){  //分配一个指定名字的新的线程对象
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
//            try {
//                Thread.sleep(1000);       //sleep方法使用
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i+"   " +
                        "优先级为"+Thread.currentThread().getPriority());

            }

//            if (i%20==0){
//                Thread.yield();
//            }

        }
    }

}

class PrintA implements Runnable{
    public PrintA() {
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i+"   " +
                        "优先级为"+Thread.currentThread().getPriority());

            }

        }
    }
}



