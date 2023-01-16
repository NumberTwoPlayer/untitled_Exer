package Thread;

/**
 * @author Email 3394427855@qq.com
 * @version 2023/1/16 18:12
 * @uesr 刘梹晨
 */
class MyThreadTest implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {
        MyThreadTest T1 = new MyThreadTest();
        Thread thread = new Thread(T1);

        thread.start();
    }
}
