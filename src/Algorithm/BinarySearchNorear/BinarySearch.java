package Algorithm.BinarySearchNorear;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/9/6 17:21
 * @uesr 刘梹晨
 */
//递归
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int index = binarySearch(arr, 0, arr.length - 1, 9);
        System.out.println("index = " + index);
    }
    /**
     * @param arr     数组
     * @param left    左边的索引
     * @param right   右边的索引
     * @param findVal 如果没有找到则返回-1
     * @return
     */
    static int binarySearch(int[] arr, int left, int right, int findVal) {
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        if (findVal > midVal) {
            return binarySearch(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return binarySearch(arr, left, mid - 1, findVal);
        } else {
            return mid;
        }
    }
}
