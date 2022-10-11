package Algorithm.BinarySearchNorear.Exer;

import java.util.Scanner;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/5 16:03
 * @uesr 刘梹晨
 */
public class Mbin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int[] N = new int[K];
        for (int i = 0; i < K; i++) {
            N[i] = scanner.nextInt();
        }
        int ans = MaxsubseqSum(K, N);
        System.out.println(ans);
    }

    public static int MaxsubseqSum(int K, int[] N) {
        int ThisSum, MaxSum;
        ThisSum = MaxSum = 0;
        for (int i = 0; i < K; i++) {
            ThisSum += N[i];
            if (ThisSum > MaxSum) {
                MaxSum = ThisSum;
            } else if (ThisSum < 0) {
                ThisSum = 0;
            }
        }
        return MaxSum;
    }
}

