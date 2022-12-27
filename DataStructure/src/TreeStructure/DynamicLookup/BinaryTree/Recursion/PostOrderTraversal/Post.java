package TreeStructure.DynamicLookup.BinaryTree.Recursion.PostOrderTraversal;

import java.util.Stack;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/12/13 14:23
 * @uesr 刘梹晨
 */

public class Post {
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

    public void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.Left);
        postOrderTraversal(root.Right);
        System.out.println(root.Val + " ");
    }
    // 后序遍历非递归
    public void postOrderTraversalNor(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;//用来指定上一个被打印过的元素
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.Left;
            }
            cur = stack.peek();
            if (cur.Right == null || cur.Right == pre) {
                TreeNode popNode = stack.pop();
                System.out.print(popNode.Val + " ");
                pre = cur;
                cur = null;
            } else {
                cur = cur.Right;
            }
        }
    }

    public static void main(String[] args) {
        Post binaryTree = new Post();
        TreeNode root = binaryTree.CreateTree();
        binaryTree.postOrderTraversal(root);//后序遍历
        System.out.println();
        binaryTree.postOrderTraversalNor(root);//后序遍历非递归实现
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
