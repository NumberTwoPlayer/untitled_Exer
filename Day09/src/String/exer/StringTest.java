package String.exer;

/**
 * @author Email 3394427855@qq.com
 * @version 2023/1/24 16:07
 * @uesr 刘梹晨
 */
/**
 * 一道面试题
 */
public class StringTest {
    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }
    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);//good
        System.out.println(ex.ch);//best
    }
}

