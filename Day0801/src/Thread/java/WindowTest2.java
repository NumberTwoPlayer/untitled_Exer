package Thread.java;

/**
 * @author Email 3394427855@qq.com
 * @version 2023/1/17 14:56
 * @uesr 刘梹晨
 */

/**
 * 使用同步方法处理继承Thread类的方式中的线程安全问题
 */
class Window2 extends Thread {
    private static int ticked = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
//            synchronized(this){//此时的this为的window的对象,三个，错误
            synchronized(Window2.class){//面向对象思想，CLass类，Class clazz = Window2.class只会加载一次只有一个
//            synchronized (obj) {
                if (ticked > 0) {
//                System.out.println(Thread.currentThread().getName());
                    System.out.println(getName() + "票号为：" + ticked);
                    ticked--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest2 {
    public static void main(String[] args) {

        Window2 t1 = new Window2();
        Window2 t2 = new Window2();
        Window2 t3 = new Window2();


        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
