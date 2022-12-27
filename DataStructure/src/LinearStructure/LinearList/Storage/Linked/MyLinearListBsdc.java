package LinearStructure.LinearList.Storage.Linked;

/**
 * 线性表链式存储常用操作集实现
 *
 * @author Email 3394427855@qq.com
 * @version 2022/10/20 9:33
 * @uesr 刘梹晨
 */
public class MyLinearListBsdc {
    private Node source = new Node();
    private int size = 0;
    private MyLinearListBsdc(){
        super();
    }
    private int length(){
        return size;
    }
    private Node FindKth(int i) {
        Node no = source;
        int j = 1;
        while (no != null && j < i) {
            no = no.getNext();
            j++;
        }
        if (j == i) {
            return no;
        } else {
            return null;
        }
    }
    private Node find(Object Value){
        Node no = source;
        while(no != null && no.getData() != Value){
            no = no.getNext();
        }
        return no;
    }
    private Node Insert(int i, Object data) throws Exception{
        Node p, s;
        if(i == 1){
            s = new Node();
            s.setData(data);
            if(size == 0){
                s.setNext(null);
            }else{
                s.setNext(source);
            }
            source = s;
            size++;
            return s;
        }
        p = FindKth(i - 1);
        if(p == null){
            throw new Exception("参数i，错误");
        }else{
            s = new Node();
            s.setData(data);
            s.setNext(p.getNext());
            p.setNext(s);
            size++;
            return source;
        }
    }
}



