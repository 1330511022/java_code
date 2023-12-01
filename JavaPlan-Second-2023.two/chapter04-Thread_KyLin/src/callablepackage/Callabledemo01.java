package callablepackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Callabledemo01 implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 101; i++) {
            Thread.sleep(20);
            System.out.println(Thread.currentThread().getName() + "子线程1---" + i);
        }
        return Thread.currentThread().getName() + "执行完毕！";
    }
}

class Callabledemo02 implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 101; i++) {
            Thread.sleep(10);
            System.out.println(Thread.currentThread().getName() + "子线程1---" + i);
        }
        return Thread.currentThread().getName() + "执行完毕！";
    }
}

class CallableMain {
    public static void main(String[] args) throws Exception {
        FutureTask futureTask1 = new FutureTask(new Callabledemo01());
        FutureTask futureTask2 = new FutureTask(new Callabledemo02());
        Thread thread1 = new Thread(futureTask1, "线程一");
        Thread thread2 = new Thread(futureTask2, "线程二");
        thread1.start();
        thread2.start();
        try {
            System.out.println(futureTask1.get());//获取返回值
            System.out.println(futureTask2.get());
        } catch (InterruptedException e) {
            throw new Exception(e);
        }
    }


}