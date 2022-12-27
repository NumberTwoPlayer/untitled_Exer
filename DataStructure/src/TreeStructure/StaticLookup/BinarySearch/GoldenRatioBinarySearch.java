package TreeStructure.StaticLookup.BinarySearch;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/12/13 12:27
 * @uesr 刘梹晨
 */
public class GoldenRatioBinarySearch {
    public static void main(String[] args) {
        double Array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double index = BinarySearch(Array, 7);
        System.out.println(index);
    }

    public static double BinarySearch(double Array[], int Value) {
        double Left = 0;
        double Right = Array.length - 1;
        while (Left <= Right) {
            double mid = Left + 0.168 * (Right - Left);
            if (Array[(int) mid] == Value) {
                return mid;
            }
            if (Array[(int) mid] >= Value) {
                Right = mid - 1;
            } else {
                Left = mid + 1;
            }
        }
        return -1;
    }
}
