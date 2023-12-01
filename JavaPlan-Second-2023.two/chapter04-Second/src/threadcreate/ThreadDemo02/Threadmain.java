package threadcreate.ThreadDemo02;

public class Threadmain {
    public static void main(String[] args) {
//        ③创建当前实现类的对象
        EvenNumberPrint evenNumberPrint = new EvenNumberPrint();
//        ④将此对象作为参数传递到Thread类的构造器中，创建Thread类的实例
        Thread thread = new Thread(evenNumberPrint);
//        ⑤Tread类的实例调用start()方法
        thread.start();
        //拓展：再创建一个线程来遍历偶数   //无需再去创建对象
        Thread thread1 = new Thread(evenNumberPrint);
        thread1.start();
        //同样的方式：匿名
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ;i<=100;i++){
                    if (i%2==0){
                        System.out.println(Thread.currentThread().getName()+"--->"+i);
                    }

                }
            }
        }).start();
        //main方法的线程
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
            }

        }
    }
}


class EvenNumberPrint implements Runnable {// ①创建一个实现Runnable接口的类
    @Override
//    ②实现接口中的run()方法---->将此线程要执行的操作，声明在此方法中
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
            }

        }
    }
}
