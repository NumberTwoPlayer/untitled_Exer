package Thread.java;

/**
 * @author Email 3394427855@qq.com
 * @version 2023/1/17 15:39
 * @uesr 刘梹晨
 */

/**
 * 使用同步方法解决实现Runnable接口的线程安全问题
 * <p>
 * 关于同步方法的总结:
 * 1. 同步方法仍然涉及到同步监视器，只是不需要我们显式的声明。
 * 2. 非静态的同步方法，同步监视器是：this
 * 静态的同步方法，同步监视器是：当前类本身
 */
class Windown3 implements Runnable {
    private int Ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private synchronized void show() {
        //synchronized(this){
        if (Ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "票号：" + Ticket);
            Ticket--;
        }
    }
}


public class WindowTest3 {
    public static void main(String[] args) {
        Windown3 M1 = new Windown3();

        Thread T1 = new Thread(M1);
        Thread T2 = new Thread(M1);
        Thread T3 = new Thread(M1);

        T1.setName("窗口一");
        T2.setName("窗口二");
        T3.setName("窗口三");

        T1.start();
        T2.start();
        T3.start();

    }
}

