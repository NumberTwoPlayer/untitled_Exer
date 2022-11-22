package LinearStructure.Queue.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/11/10 14:34
 * @uesr 刘梹晨
 */
public class MyqueueExerH {
    public int[] queue;
    public int rear;
    public int front;
    public int maxSize;
    public MyqueueExerH(int maxSize){
        queue = new int[maxSize];
        this.rear = 0;
        this.front = 0;
        this.maxSize = maxSize;
    }
    public boolean isFull(){
        return (rear + 1) % maxSize == front;
    }
    public boolean isEmpty(){
        return rear == front;
    }
    public void addqueue(int item)throws Exception{
        if(isFull()){
            throw new Exception("表满");
        }else{
            rear = (rear + 1) % maxSize;
            queue[rear] = item;
        }
    }
    public int deteleQueue()throws Exception{
        if(isEmpty()){
            throw new Exception("表空");
        }else{
            front = (front + 1) % maxSize;
            return queue[front];
        }
    }
}

