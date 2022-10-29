package LinearStructure.Queue.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/28 17:56
 * @uesr 刘梹晨
 */
public class MyqueueExerD {
    private int[] Queue;
    private int rear;
    private int front;
    private int maxSize;
    private MyqueueExerD(int maxSize){
        Queue = new int[maxSize];
        this.maxSize = maxSize;
        this.rear = 0;
        this.front = 0;
    }
    public boolean isFull(){
        return (rear + 1) % maxSize == front;
    }
    public void addQueue(int item)throws Exception{
        if(isFull()){
            throw new Exception("队列为满");
        }else{
            rear = (rear + 1) % maxSize;
            Queue[rear] = item;
        }
    }
    public boolean isEmpty(){
        return rear == front;
    }
    public int deteleQueue()throws Exception{
        if(isEmpty()){
            throw new Exception("队列为空");
        }else{
            return Queue[front];
        }
    }
}
