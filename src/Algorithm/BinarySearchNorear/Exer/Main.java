package Algorithm.BinarySearchNorear.Exer;

import java.util.Scanner;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/9/7 11:06
 * @uesr 刘梹晨
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int[] a = new int[K];
        for (int i = 0; i < K; i++) {
            a[i] = scanner.nextInt();
        }
        int ans = MaxSubseqSum(a, K);
        System.out.println(ans);
    }

    private static int max3(int maxleftSum, int maxrightSum, int i) {
        return maxleftSum > maxrightSum ? maxleftSum > i ? maxleftSum : i : maxrightSum > i ? maxrightSum : i;
    }
    private static int MaxSubseqSum(int[] a, int k) {
        return DividAndConquer(a, 0, k - 1);
    }

    public static int DividAndConquer(int[] N, int left, int right) {
        int MaxleftSum, MaxrightSum;
        int MaxLeftBorderSum, MaxRightBorderSum;
        int LeftBorderSum, RightBorderSum;
        int pivot = (left + right) / 2;//(left + (right - left)) / 2

        if (left == right) {
            if (N[left] > 0) {
                return N[left];
            } else {
                return 0;
            }
        }

        MaxleftSum = DividAndConquer(N, left, pivot);
        MaxrightSum = DividAndConquer(N, pivot + 1, right);

        MaxLeftBorderSum = 0;
        LeftBorderSum = 0;
        for (int i = 0; i >= left; i--) {
            LeftBorderSum += N[i];
            if (LeftBorderSum > MaxLeftBorderSum) {
                MaxLeftBorderSum = LeftBorderSum;
            }
        }

        MaxRightBorderSum = 0;
        RightBorderSum = 0;
        for (int i = 0; i <= right; i++) {
            if (RightBorderSum > MaxRightBorderSum) {
                MaxRightBorderSum = RightBorderSum;
            }
        }
        return max3(MaxleftSum, MaxrightSum, MaxLeftBorderSum + MaxRightBorderSum);

    }
}
