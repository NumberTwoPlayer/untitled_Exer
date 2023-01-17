package Thread.java;

/**
 * @author Email 3394427855@qq.com
 * @version 2023/1/14 9:48
 * @uesr 刘梹晨
 *
 * 创建多线程方式一：
 * //1、创建一个继承于Thread类的子类
 * //2、重写Thread类的run方法
 * //3、创建Thread类的子类的对象
 *  //4、通过此方法调用start()
 */
//1、创建一个继承于Thread类的子类
class MyThread extends Thread{
    //2、重写Thread类的run方法 --> 将此线程执行的操作声明在run()中
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        //3、创建Thread类的子类的对象
        MyThread t1 = new MyThread();

        //4、通过此方法调用start() ①、启动当前线程 ②、调用当前线程的run()
        t1.start();
        //问题一：我们不能通过直接调用run()的方式启动线程
//        t1.run();
        //问题二：再启动一个线程，遍历100以内的偶数
        MyThread t2 = new MyThread();
        t2.start();

        System.out.println("love wuyu");
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i + "******");
            }
        }
    }
}
