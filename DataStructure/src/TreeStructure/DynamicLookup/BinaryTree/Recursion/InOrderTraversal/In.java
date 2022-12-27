package TreeStructure.DynamicLookup.BinaryTree.Recursion.InOrderTraversal;

import java.util.Stack;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/12/13 14:23
 * @uesr 刘梹晨
 */

public class In {
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
    // 中序遍历
    public void InOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        InOrderTraversal(root.Left);
        System.out.print(root.Val + " ");
        InOrderTraversal(root.Right);
    }
    //中序遍历非递归
    void InOrderTraversalNor(TreeNode root){
        if (root == null) {
            return;
        }
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (cur != null || !stack.empty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.Left;
            }
            TreeNode top = stack.pop();
            System.out.print(top.Val + " ");
            cur = top.Right;
        }

    }


    public static void main(String[] args) {
        In binaryTree = new In();
        TreeNode root = binaryTree.CreateTree();
        binaryTree.InOrderTraversal(root);//中序遍历
        System.out.println();
        binaryTree.InOrderTraversalNor(root);//中序遍历非递归遍历
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
