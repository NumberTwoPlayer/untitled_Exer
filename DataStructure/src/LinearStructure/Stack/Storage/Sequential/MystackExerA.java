package LinearStructure.Stack.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/21 8:38
 * @uesr 刘梹晨
 */
public class MystackExerA {
    //一维数组（即为栈）
    public int[] Mystackexer;
    //记录栈顶的位置（即数组的下标）
    public int Top;

    private MystackExerA(int maxSize){
        //给栈分配空间
        Mystackexer = new int[maxSize];
        //现在为空栈，栈顶的位置为-1表示当前的栈为空
        this.Top = -1;
    }
    /**
     * 判断栈是否满--isFull
     *
     * @return 如果满返回true，否则返回false--boolean
     */
    public boolean isFull(){
        return Top == Mystackexer.length - 1;
    }

    /**
     * 入栈，将元素加入到栈中--push
     *
     * @param item 添加到栈中的元素
     * @throws Exception 异常处理
     */
    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("栈满");
        }else{
            Mystackexer[++Top] = item;
        }
    }

    /**
     * 判断栈是否空--isEmpty
     *
     * @return 如果栈为空返回true，否则返回false
     */
    public boolean isEmpty(){
        return Top == -1;
    }

    /**
     * 出栈，删除并返回栈顶元素--pop
     *
     * @return 返回栈顶元素
     * @throws Exception
     */
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("栈空");
        }else{
            return Mystackexer[Top--];
        }
    }

    public static void main(String[] args) throws Exception {
        MystackExerA my = new MystackExerA(3);

        System.out.println(my.Top);//当前栈的栈顶位置
        System.out.println(my.isFull());//判断当前栈是否已满
        System.out.println(my.isEmpty() + "\n");//判断栈是否为空

        my.push(11);
        System.out.println(my.Top);//当前栈的栈顶位置
        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
        my.push(22);
        System.out.println(my.Top);//当前栈的栈顶位置
        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
        my.push(33);
        System.out.println(my.Top);//当前栈的栈顶位置
        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
//        my.push(33);
//        System.out.println(my.top);//当前栈的栈顶位置
//        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
        System.out.println(my.isEmpty() + "\n");//判断栈是否为空

        my.pop();
        System.out.println(my.Top);//当前栈的栈顶位置
        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
        my.pop();
        System.out.println(my.Top);//当前栈的栈顶位置
        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
        my.pop();
        System.out.println(my.Top);//当前栈的栈顶位置
        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
//        my.pop();
//        System.out.println(my.top);//当前栈的栈顶位置
//        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
        System.out.println(my.isEmpty() + "\n");//判断栈是否为空
    }
}
