package TreeStructure.DynamicLookup.BinaryTree.NorRecursion;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/12/14 23:37
 * @uesr 刘梹晨
 */
public class TreeNor {

}
class TreeNode{
    public char val;
    public TreeNode Left;
    public TreeNode Right;
    public TreeNode(char Val){
        this.val = Val;
    }
}
class Node{
    private Object Data;
    private Node Next;
    public Node(){
        super();
    }
    public Node(Object Data, Node Next){
        super();
        this.Data = Data;
        this.Next = Next;
    }
    public Node(Object Data){
        super();
        this.Data = Data;
    }
    public Object getData(){
        return Data;
    }
    public void setData(Object Data){
        this.Data = Data;
    }
    public Node getNext(){
        return Next;
    }
    public void setNext(Node Next){
        this.Next = Next;
    }


}
