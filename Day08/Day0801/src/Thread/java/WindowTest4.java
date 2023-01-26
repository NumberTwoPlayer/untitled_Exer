package Thread.java;

/**
 * @author Email 3394427855@qq.com
 * @version 2023/1/17 15:51
 * @uesr 刘梹晨
 */
class Window4 extends Thread{
    private static int ticked = 100;
    @Override
    public void run() {
        while(true){
            show();
        }
    }
    private static synchronized void show(){
        if(ticked > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "票号为：" + ticked);
            ticked--;
        }
    }
}
public class WindowTest4 {
    public static void main(String[] args) {

        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();


        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
