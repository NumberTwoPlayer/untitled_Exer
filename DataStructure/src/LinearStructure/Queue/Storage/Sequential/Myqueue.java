package LinearStructure.Queue.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/23 18:25
 * @uesr 刘梹晨
 */
public class Myqueue {
    private int[] queue;//一维数组（即队列）
    private int front;//记录队列头元素位置
    private int rear;//记录队列尾元素位置
    private int maxSize;//队列最大容量

    private Myqueue(int maxSize) {
        queue = new int[maxSize];//分配数组空间
        this.maxSize = maxSize;//初始化变量
        this.front = 0;//将队列头和尾都初始化为0
        this.rear = 0;
    }

    /**
     * 判断队列是否满
     *
     * @return 如果已满返回true，否则返回false
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    /**
     * 给队列添加元素
     *
     * @param item 要加入队列的元素
     * @throws Exception 抛出异常
     */
    public void addQueue(int item) throws Exception {
        //判断在添加元素之前
        if (isFull()) {
            throw new Exception("队列已满");
        } else {
            rear = (rear + 1) % maxSize;
            queue[rear] = item;
        }
    }

    /**
     * 判断队列为空
     *
     * @return 如果已满返回true，否则返回false
     */
    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * 删除并返回队列元素
     *
     * @return 返回要删除的队列元素
     * @throws Exception 抛出异常
     */
    public int deteleQueue() throws Exception {
        if (isEmpty()) {
            throw new Exception("队列为空");
        } else {
            front = (front + 1) % maxSize;
            return queue[front];
        }
    }

    public static void main(String[] args) throws Exception {
        Myqueue my = new Myqueue(4);

        System.out.println(my.rear);
        System.out.println(my.front);
        System.out.println(my.isFull());//判断队列是否为满
        System.out.println(my.isEmpty() + "\n");//判断队列是否为空

        my.addQueue(11);
        System.out.println(my.rear);
        System.out.println(my.front);
        for(int i = my.rear; i <= my.rear && i > 0; i--){
            System.out.print(my.queue[i] + "\t");
        }
        System.out.println();
        System.out.println(my.isFull());//判断队列是否为满
        System.out.println(my.isEmpty() + "\n");//判断队列是否为空
        my.addQueue(22);
        System.out.println(my.rear);
        System.out.println(my.front);
        for(int i = my.rear; i <= my.rear && i > 0; i--){
            System.out.print(my.queue[i] + "\t");
        }
        System.out.println();
        System.out.println(my.isFull());//判断队列是否为满
        System.out.println(my.isEmpty() + "\n");//判断队列是否为空
        my.addQueue(33);
        System.out.println(my.rear);
        System.out.println(my.front);
        for(int i = my.rear; i <= my.rear && i > 0; i--){
            System.out.print(my.queue[i] + "\t");
        }
        System.out.println();
        System.out.println(my.isFull());//判断队列是否为满
        System.out.println(my.isEmpty() + "\n");//判断队列是否为空
//        my.addQueue(33);
//        System.out.println(my.rear);
//        System.out.println(my.front);
//        for(int i = my.rear; i <= my.rear && i > 0; i--){
//            System.out.print(my.queue[i] + "\t");
//        }
//        System.out.println();
//        System.out.println(my.isFull());//判断队列是否为满
//        System.out.println(my.isEmpty() + "\n");//判断队列是否为空

        /****************************************************************************************/
        my.deteleQueue();
        System.out.println(my.rear);
        System.out.println(my.front);
        for(int i = my.front;i <= my.front && i > 0; i--){
            System.out.print(my.queue[i] + "\t");
        }
        System.out.println();
        System.out.println(my.isFull());//判断队列是否为满
        System.out.println(my.isEmpty() + "\n");//判断队列是否为空

        my.deteleQueue();
        System.out.println(my.rear);
        System.out.println(my.front);
        for(int i = my.front;i <= my.front && i > 0; i--){
            System.out.print(my.queue[i] + "\t");
        }
        System.out.println();
        System.out.println(my.isFull());//判断队列是否为满
        System.out.println(my.isEmpty() + "\n");//判断队列是否为空

        my.deteleQueue();
        System.out.println(my.rear);
        System.out.println(my.front);
        for(int i = my.front;i <= my.front && i > 0; i--){
            System.out.print(my.queue[i] + "\t");
        }
        System.out.println();
        System.out.println(my.isFull());//判断队列是否为满
        System.out.println(my.isEmpty() + "\n");//判断队列是否为空

        my.addQueue(11);
        System.out.println(my.rear);
        System.out.println(my.front);
        for(int i = my.rear; i <= my.rear && i > 0; i--){
            System.out.print(my.queue[i] + "\t");
        }
        System.out.println();
        System.out.println(my.isFull());//判断队列是否为满
        System.out.println(my.isEmpty() + "\n");//判断队列是否为空
        my.addQueue(22);
        System.out.println(my.rear);
        System.out.println(my.front);
        for(int i = my.rear; i <= my.rear && i > 0; i--){
            System.out.print(my.queue[i] + "\t");
        }
        System.out.println();
        System.out.println(my.isFull());//判断队列是否为满
        System.out.println(my.isEmpty() + "\n");//判断队列是否为空
        my.addQueue(33);
        System.out.println(my.rear);
        System.out.println(my.front);
        for(int i = my.rear; i <= my.rear && i > 0; i--){
            System.out.print(my.queue[i] + "\t");
        }
        System.out.println();
        System.out.println(my.isFull());//判断队列是否为满
        System.out.println(my.isEmpty() + "\n");//判断队列是否为空

        my.deteleQueue();
        System.out.println(my.rear);
        System.out.println(my.front);
        for(int i = my.front;i <= my.front && i > 0; i--){
            System.out.print(my.queue[i] + "\t");
        }
        System.out.println();
        System.out.println(my.isFull());//判断队列是否为满
        System.out.println(my.isEmpty() + "\n");//判断队列是否为空

        my.deteleQueue();
        System.out.println(my.rear);
        System.out.println(my.front);
        for(int i = my.front;i <= my.front && i > 0; i--){
            System.out.print(my.queue[i] + "\t");
        }
        System.out.println();
        System.out.println(my.isFull());//判断队列是否为满
        System.out.println(my.isEmpty() + "\n");//判断队列是否为空
        my.addQueue(33);
        System.out.println(my.rear);
        System.out.println(my.front);
        for(int i = my.rear; i <= my.rear && i > 0; i--){
            System.out.print(my.queue[i] + "\t");
        }
        System.out.println();
        System.out.println(my.isFull());//判断队列是否为满
        System.out.println(my.isEmpty() + "\n");//判断队列是否为空


    }
}
