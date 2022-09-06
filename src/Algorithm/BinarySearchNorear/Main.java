package Algorithm.BinarySearchNorear;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/9/5 23:33
 * @uesr 刘梹晨
 */
//非递归
public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = BinartSearchNoRear(arr, 0);
        System.out.println("index = " + index);
    }
    static int BinartSearchNoRear(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
