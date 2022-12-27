package TreeStructure.DynamicLookup.BinaryTree.Recursion.PreOrderTraversal;

import java.util.Stack;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/12/13 14:22
 * @uesr 刘梹晨
 */
public class Pre {
    public TreeNode CreateTree() {
        TreeNode A = new TreeNode('a');
        TreeNode B = new TreeNode('b');
        TreeNode C = new TreeNode('c');
        TreeNode D = new TreeNode('d');
        TreeNode E = new TreeNode('e');
        TreeNode F = new TreeNode('f');
        TreeNode G = new TreeNode('g');
        TreeNode H = new TreeNode('h');
        A.Left = B;
        A.Right = C;
        B.Left = D;
        B.Right = E;
        E.Right = H;
        C.Left = F;
        C.Right = G;
        return A;
    }
    //前序遍历
    public void  preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.Val + " ");
        preOrderTraversal(root.Left);
        preOrderTraversal(root.Right);
    }

    //前序遍历非递归实现
    public void preOrderTraversalNor(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                System.out.print(cur.Val + " ");
                cur = cur.Left;
            }
            TreeNode top = stack.pop();
            cur = top.Right;
        }
    }

    //前序遍历
    public static void main(String[] args) {
        Pre binaryTree = new Pre();
        TreeNode root = binaryTree.CreateTree();
        binaryTree. preOrderTraversal(root);//先序遍历
        System.out.println();
        binaryTree.preOrderTraversalNor(root);//先序遍历非递归实现
    }

}

class TreeNode {
    public char Val;
    public TreeNode Left;
    public TreeNode Right;

    public TreeNode(char val) {
        this.Val = val;
    }
}
