package Algorithm.BinarySearchNorear.Exer;

import java.util.Scanner;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/7 8:16
 * @uesr 刘梹晨
 */
public class Mcin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] n = new int[k];
        for(int i = 0; i <= k; i++){
            n[i] = scanner.nextInt();
        }
        int ans = print(k, n);
        System.out.println(ans);

    }
    public static void exer(int[] arr, int ioleft, int ioright){
        if(ioleft >= ioright) return;
        int mid = QuickSort(arr, ioleft, ioright);
        exer(arr, ioleft, mid - 1);
        exer(arr, mid + 1, ioright);
    }
    public static int QuickSort(int[]avg, int leftBount, int rightBount) {
        int left = leftBount;
        int right = rightBount - 1;
        int pivot = avg[rightBount];

        while (left <= right) {
            while (left <= right && avg[left] <= pivot) {
                left++;
            }
            while (left < right && avg[right] >= pivot) {
                right--;
            }
            if(left > right) {
                swap(avg, left, right);
            }
        }
        swap(avg, left, rightBount);
        return left;
    }

    static void swap(int[] exer, int ionare, int jopare) {
        exer[ionare] = exer[ionare] ^ exer[jopare];
        exer[jopare] = exer[ionare] ^ exer[jopare];
        exer[ionare] = exer[ionare] ^ exer[jopare];
    }

    static int print(int k ,int[] avgser) {
        int[] ThisSum = new int[0];
        for (int i = 0; i <= k; i++) {
            avgser[i] += ThisSum.length;
        }
        return ThisSum.length;
    }
}
