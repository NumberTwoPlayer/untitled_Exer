package Algorithm.BinarySearchNorear.Exer;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/9/7 11:06
 * @uesr 刘梹晨
 */
public class Project {
    public static void main(String[] args) {

    }

    static int binarySearchNorear(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(left <= arr[mid]) {
                if (arr[0] <= target && target <= arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }else{
                if(arr[mid] <= target && target <= arr[arr.length - 1]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
