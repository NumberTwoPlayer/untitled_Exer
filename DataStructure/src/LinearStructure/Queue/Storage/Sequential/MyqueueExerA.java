package LinearStructure.Queue.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/24 19:39
 * @uesr 刘梹晨
 */
public class MyqueueExerA {
    //一维数组（即队列）
    private int[] Queue;
    //记录队列头元素位置
    private int rear;
    //记录队列尾元素位置
    private int front;
    //队列最大容量
    private int maxSize;

    public MyqueueExerA(int maxSize) {
        //分配数组空间
        Queue = new int[maxSize];
        //初始化变量
        this.maxSize = maxSize;
        //将队列头和尾都初始化为0

        this.rear = 0;
        this.front = 0;
    }
    /**
     * 判断队列是否满
     *
     * @return 如果已满返回true，否则返回false
     */
    public boolean isFull(){
        return (rear + 1) % maxSize == front;
    }

    /**
     * 给队列添加元素
     *
     * @param item 要加入队列的元素
     * @throws Exception 抛出异常
     */
    public void addQueue(int item)throws Exception{
        if(isFull()){
            throw new Exception("1");
        }else{
            rear = (rear + 1) % maxSize;
            Queue[rear] = item;
        }
    }

    /**
     * 判断队列为空
     *
     * @return 如果已满返回true，否则返回false
     */
    public boolean isEmpty(){
        return rear == front;
    }

    /**
     * 删除并返回队列元素
     *
     * @return 返回要删除的队列元素
     * @throws Exception 抛出异常
     */
    public int deteleQueue()throws Exception{
        if(isEmpty()){
            throw new Exception("2");
        }else{
            front = (front + 1) % maxSize;
            return Queue[front];
        }
    }
}
