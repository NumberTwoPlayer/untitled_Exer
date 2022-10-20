package Algorithm.BinarySearchNorear.Exer;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/12 13:41
 * @uesr 刘梹晨
 */
public class Mfin {
    public static int[] sumIndex(int[] nums) {
        int arr = 0;
        int[] ArrayExer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr += nums[i];
            ArrayExer[i] = arr;
        }
        return ArrayExer;
    }

}
