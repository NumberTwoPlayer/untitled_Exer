package Thread.Java2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Email 3394427855@qq.com
 * @version 2023/1/24 12:55
 * @uesr 刘梹晨
 *
 *创建线程的方式四：使用线程池
 * 好处
 * 1、提高响应速度（减少）
 */
class NumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 ==  0){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}
class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 !=  0){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        //1、提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);//接口，多态
        ThreadPoolExecutor service1 = (ThreadPoolExecutor)service;

        //设置线程池的属性
        //设置线程池得到属性:class java.util.concurrent.ThreadPoolExecutor
        System.out.println(service.getClass());
//        service1.setCorePoolSize(15);
//        service1.setKeepAliveTime(15);

        //2、执行指定的线程的操作，需要提供实现Runnable接口或者Callable接口实现类的对象
        service.execute(new NumberThread());//适合适用于Runnable
        service.execute(new NumberThread1());

//        service.submit(Callable callable);//适合适用于Callable

        //3、关闭连接池
        service.shutdown();
    }
}
