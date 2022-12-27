package LinearStructure.LinearList.Storage.Linked;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/11/26 15:39
 * @uesr 刘梹晨
 */
public class NodeA {
    public Object data;
    public Node Next;
    public NodeA(){
        super();
    }
    public NodeA(Object data, Node Next){
        super();
        this.data = data;
        this.Next = Next;
    }
    public NodeA(Object data){
        super();
        this.data = data;
    }
    public Object getData(){
        return data;
    }
    public void setData(Object data){
        this.data = data;
    }
    public Node getNext(){
        return Next;
    }
    public void setNext(Node next){
        this.Next = Next;
    }

}
