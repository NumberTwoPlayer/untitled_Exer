package LinearStructure.Queue.Storage.Linked;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/26 9:08
 * @uesr 刘梹晨
 */
public class Node {
    public Object Data;
    public Node Next;
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
    public void setData(Object data){
        this.Data = Data;
    }
    public Node getNext(){
        return Next;
    }
    public void setNext(Node Next){
        this.Next = Next;
    }
}
