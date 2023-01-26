package Thread.Java1;

/**
 * @author Email 3394427855@qq.com
 * @version 2023/1/17 16:08
 * @uesr 刘梹晨
 */
public class BankTest {
}

class Bank {
    private Bank() {}
    private static Bank instance = null;

    public static Bank getInstance() {
        //方式一：效率较差
//        synchronized (Bank.class){
//            if(instance == null){
//                instance = new Bank();
//            }
//            return instance;
//        }
        //方式二：效率较高
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
