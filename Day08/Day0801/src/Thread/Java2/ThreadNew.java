package Thread.Java2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Email 3394427855@qq.com
 * @version 2023/1/19 19:25
 * @uesr 刘梹晨
 */
class NumThread implements Callable{
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

public class ThreadNew {
    public static void main(String[] args) {
        NumThread num = new NumThread();

        FutureTask futureTask = new FutureTask(num);

        new Thread(futureTask).start();

        try {
            Object sum = futureTask.get();
            System.out.println("返回值：" + sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
