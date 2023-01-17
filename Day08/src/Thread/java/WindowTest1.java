package Thread.java;

/**
 * 创建三个窗口买票，总票数为100张,使用Runnable接口
 * 存在线程安全问题
 *
 * @author Email 3394427855@qq.com
 * @version 2023/1/16 18:24
 * @uesr 刘梹晨
 */

class Window1 implements Runnable {
    private int Ticket = 100;
    @Override
    public void run() {
        while (true) {
            if (Ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "票号：" + Ticket);
                Ticket--;
            }else{
                break;
            }
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 M1 = new Window1();

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
