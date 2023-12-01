package threadcreate;
//创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数

public class ThreadWork {
    public static void main(String[] args) {
        //方式一：
//        TreadEven treadEven = new TreadEven();
//        TreadODD treadODD = new TreadODD();
//        treadEven.start();//奇数
//        treadODD.start();//偶数
        //方式二：创建Tread类的匿名子类的匿名对象
        new Thread(){  public void run() {
            for (int i = 0 ;i<=100;i++){
                if (i%2!=0){
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }

            }
        }}.start();

        new Thread(){ public void run() {
            for (int i = 0 ;i<=100;i++){
                if (i%2==0){
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }

            }
        }}.start();

        //方式三：使用Runnable()接口的方式：（提供了Runnable接口的匿名实现类的匿名对象）
        new Thread( new Runnable(){
            @Override
            public void run() {
                for (int i = 0 ;i<=100;i++){
                    if (i%2!=0){
                        System.out.println(Thread.currentThread().getName()+"--->"+i);
                    }

                }
            }
        }).start();

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


    }
}


class TreadEven extends Thread{
    @Override
    public void run() {
        for (int i = 0 ;i<=100;i++){
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+"--->"+i);
            }

        }
    }
}
class TreadODD extends Thread{
    @Override
    public void run() {
        for (int i = 0 ;i<=100;i++){
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+"--->"+i);
            }

        }
    }
}

