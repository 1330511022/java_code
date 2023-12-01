package threadcreate.ThreadDemo01;

//创建一共分线程1，用于遍历100以内的偶数
public class Threadmain {
    //③创建当前Thread的子类的对象
    public static void main(String[] args) {
        PrintNumb printNumb = new PrintNumb();
//    ④通过对象调用start()方法
        printNumb.start();
        PrintNumb printNumb2 = new PrintNumb();
        //创建对象printNumb2来执行创建分线程的操作
        printNumb2.start();
        //main（）方法线程执行的操作
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                //Thread.currentThread().getName()方法可显示出当前使用的线程
            }

        }


    }

}


class PrintNumb extends Thread {
    //①创建一个继承于Thread类的子类
//    ②重写Thread类的run方法---->将此线程要执行的操作，声明在此方法中
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);

            }

        }
    }

}



