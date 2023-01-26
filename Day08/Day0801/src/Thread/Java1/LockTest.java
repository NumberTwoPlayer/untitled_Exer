package Thread.Java1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Email 3394427855@qq.com
 * @version 2023/1/18 15:19
 * @uesr 刘梹晨
 */
/**
 * 解决线程安全问题的方式三：lock锁---》JDK5.0新增
 *
 * 注意：如果同步代码有异常，要将unlock()写入finally语句块
 *
 * 1. 面试题：synchronized 与 Lock的异同？
 *    相同：二者都可以解决线程安全问题
 *    不同：synchronized机制在执行完相应的同步代码以后，自动的释放同步监视器
 *         Lock需要手动的启动同步（lock()），同时结束同步也需要手动的实现（unlock()）
 *
 * 2.优先使用顺序：
 *      Lock 同步代码块（已经进入了方法体，分配了相应资源）同步方法（在方法体之外）
 *
 * 面试题：如何解决线程安全问题？有几种方式
 */

class Window implements Runnable{
    private int Ticked = 100;
    //1.实例化ReentrantLock
    private ReentrantLock lo = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            try {
                //调用锁定方法：lock()
                lo.lock();
                if (Ticked > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " " + Ticked);
                    Ticked--;
                } else {
                    break;
                }
            }finally {
                //3.调用解锁方法：unlock()
                lo.unlock();
            }
        }
    }
}
public class LockTest {
    public static void main(String[] args) {
        Window w = new Window();

        Thread T1 = new Thread(w);
        Thread T2 = new Thread(w);
        Thread T3 = new Thread(w);

        T1.setName("一号");
        T2.setName("二号");
        T3.setName("三号");

        T1.start();
        T2.start();
        T3.start();
    }
}
