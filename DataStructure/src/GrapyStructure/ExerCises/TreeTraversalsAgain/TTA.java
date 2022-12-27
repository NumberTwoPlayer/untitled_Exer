package GrapyStructure.ExerCises.TreeTraversalsAgain;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/11/30 18:26
 * @uesr 刘梹晨
 */
public class TTA {
    static class solve {
        private int[] pre;
        private int[] in;
        private int[] posh;

        public solve(int maxSize) {
            posh = new int[maxSize];
        }

        /**
         * 递归函数
         *
         * @param preL  先序遍历最左边元素数组的下标
         * @param inL   中序遍历第一个结点的位置
         * @param poshL 后序遍历第一个结点的位置
         * @param n     当前数组元素的个数
         */
        private void solveTest(int preL, int inL, int poshL, int n) {

            n = 6;
            preL = pre[0];
            inL = in[0];
            poshL = posh[0];

            if (n == 0) {
                return;
            }
            if (n == 1) {
                posh[poshL] = pre[preL];
                return;
            }
            int root = pre[preL];
            posh[poshL + n - 1] = root;
            for (int i = 0; i < n; i++) {
                if (in[inL + 1] == root) {
                    break;
                }
            }
            int Left = 0;
            int Right = n - Left - 1;
            solveTest(preL + 1, inL, poshL, Left);
            solveTest(preL + Left + 1, inL + Left + 1, poshL + 1, Right);

        }
    }

    public static void main(String[] args) {
        solve sc = new solve(6);
        sc.solveTest(1, 3, 3, 6);
        System.out.println(sc.posh);
    }
}