package TreeStructure.BST.BinarySearchTree.Find.RecursionTest;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/11/2 19:04
 * @uesr 刘梹晨
 */
public class BSTree {
    static class TreeNode{
        public int val;//值
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val){
            //初始化，构造方法，用于赋值
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    private TreeNode Root = null;

    public TreeNode Find(int key){
        if(Root == null){
            return null;
        }
        //迭代函数
        //查找
        TreeNode cur = Root;
        while(cur != null){
            if(cur.val == key){
                return cur;
            }else if(cur.val > key){
                cur = cur.left;
            }else{
                cur = cur.right;
            }
        }
        return null;
    }
}
