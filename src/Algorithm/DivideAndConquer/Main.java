package Algorithm.DivideAndConquer;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/9/5 23:33
 * @uesr 刘梹晨
 */
public class Main {
    public static void main(String[] args) {
        HanoiTower(5,'A','B','C');
    }

    public static void HanoiTower(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println("第1个盘从:" + a + " --> " + c);
        } else {
            HanoiTower(num - 1, a, c, b);
            System.out.println("第" + num + "个盘从:" + a + " --> " + c);
            HanoiTower(num - 1, b, a, c);
        }
    }
}
