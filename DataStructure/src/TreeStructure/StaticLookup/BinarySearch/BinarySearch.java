package TreeStructure.StaticLookup.BinarySearch;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/26 15:42
 * @uesr 刘梹晨
 */
public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = binear(array, 10);
        System.out.println(index);
    }

    public static int binear(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] >= value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
