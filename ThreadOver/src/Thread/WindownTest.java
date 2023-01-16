package Thread;

/**
 * 创建三个窗口买票，总票数为100张
 *
 * @author Email 3394427855@qq.com
 * @version 2023/1/16 17:20
 * @uesr 刘梹晨
 */
class Window extends Thread{
    private static int ticked = 100;
    @Override
    public void run() {
        while(true){
            if(ticked > 0){
//                System.out.println(Thread.currentThread().getName());
                System.out.println(getName() + "票号为：" + ticked);
                ticked--;
            }else{
                break;
            }
        }
    }
}
public class WindownTest {
    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }

}
