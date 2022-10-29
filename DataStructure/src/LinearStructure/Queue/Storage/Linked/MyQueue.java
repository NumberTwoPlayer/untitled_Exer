package LinearStructure.Queue.Storage.Linked;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/23 18:25
 * @uesr 刘梹晨
 */
public class MyQueue {
    private Node front;//指向队列头元素的引用
    private Node rear;//指向队列尾元素的引用
    private MyQueue(){
       front = null;
       rear = null;
    }

    /**
     * 判断队列是否为空
     *
     * @return 如果队列为空返回true，否则返回false
     */
    public boolean isEmpty(){
        //指向队头元素的引用为空，即队列为空
        return front == null;
    }

    /**
     * 入队
     *
     * @param item 要在队尾插入的元素
     */
    public void addQueue(Object item){
        //创建一个要插入的新结点
        Node newNode = new Node();
        newNode.setData(item);
        newNode.setNext(null);
        //考虑队列为空的情况
        if(isEmpty()){
            //将队头和队尾都指向新添加的结点
            front = newNode;
            rear = front;
        }else{
            //队列有元素的情况下
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public Object dateleQueue()throws Exception{
        if(isEmpty()){
            throw new Exception("队列为空");
        }else{
            //要删除的就是头结点所在的元素
            Node delNode = front;
            //如果队列只有一个元素
            if (front == rear) {
                //删除后队列置为空
                front = rear = null;
            }else{
                //将队列头元素结点指向元队列头的下一个结点
                front = front.getNext();
            }
            //返回要删除结点的数据
            return delNode.getData();
        }
    }
}
