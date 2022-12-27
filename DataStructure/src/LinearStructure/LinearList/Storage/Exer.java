package LinearStructure.LinearList.Storage;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/11/28 10:16
 * @uesr 刘梹晨
 */
public class Exer {
    public static void main(String[] args) {
        Solution sc = new Solution();

        int[][] matrix = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println(sc.searchMatrix(matrix, 30));
        System.out.println(sc.searchMatrix(matrix, 99));

        int LeftBty = matrix.length;
        int RightBty = matrix[0].length - 1;
        int leftBty = 0;
        int rightBty = RightBty;
        System.out.println(LeftBty + " " + RightBty + " " + leftBty + " " + rightBty + " ");

    }
}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int LeftBount = matrix.length;//5
        int RightBount = matrix[0].length - 1;
        int left = 0;
        int right = RightBount;//4

        while (left < LeftBount && right >= 0) {
            if (matrix[left][right] == target) {
                return true;
            }
            if (matrix[left][right] > target) {//0,4 - 15
                --right;
            } else {
                ++left;
            }
        }
        return false;
    }
}
