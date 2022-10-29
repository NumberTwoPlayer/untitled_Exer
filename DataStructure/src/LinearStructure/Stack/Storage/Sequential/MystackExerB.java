package LinearStructure.Stack.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/21 9:04
 * @uesr 刘梹晨
 */
public class MystackExerB {
    //一维数组（即为栈）
    public int[] Stack;
    //记录栈顶的位置（即数组的下标）
    public int Top;
    private MystackExerB(int maxSize){
        //给栈分配空间
        Stack = new int[maxSize];
        //现在为空栈，栈顶的位置为-1表示当前的栈为空
        this.Top = -1;
    }

    /**
     * 判断栈是否满
     *
     * @return 如果满返回true，否则返回false
     */
    public boolean isFull(){
        return Top == Stack.length - 1;
    }

    /**
     * 入栈，将元素加入到栈中
     *
     * @param item 添加到栈中的元素
     * @throws Exception 异常处理
     */
    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("1");
        }else{
            Stack[++Top] = item;
        }
    }

    /**
     * 判断栈是否空
     *
     * @return 如果栈为空返回true，否则返回false
     */
    public boolean isEmpty(){
        return Top == -1;
    }

    /**
     * 出栈，删除并返回栈顶元素
     *
     * @return 返回栈顶元素
     * @throws Exception
     */
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("2");
        }else{
            return Stack[Top--];
        }
    }

    public static void main(String[] args) throws Exception {
        MystackExerB sc = new MystackExerB(3);
        System.out.println(sc.isFull());
        System.out.println(sc.isEmpty());
        System.out.println(sc.Top);

        sc.push(11);
        System.out.println(sc.isFull());
        System.out.println(sc.isEmpty());
        System.out.println(sc.Top);
        sc.push(22);
        System.out.println(sc.isFull());
        System.out.println(sc.isEmpty());
        System.out.println(sc.Top);
        sc.push(33);
        System.out.println(sc.isFull());
        System.out.println(sc.isEmpty());
        System.out.println(sc.Top);

        sc.pop();
        System.out.println(sc.isFull());
        System.out.println(sc.isEmpty());
        System.out.println(sc.Top);
        sc.pop();
        System.out.println(sc.isFull());
        System.out.println(sc.isEmpty());
        System.out.println(sc.Top);
        sc.pop();
        System.out.println(sc.isFull());
        System.out.println(sc.isEmpty());
        System.out.println(sc.Top);
    }
}
