package LinearStructure.Stack.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/20 8:55
 * @uesr 刘梹晨
 */
public class Mystack {
    public int[] stack;
    public int top;
    private Mystack(int maxSize){
        stack = new int[maxSize];
        this.top = -1;
    }
    public boolean isFull(){
        return top == stack.length - 1;//判断栈是否满，如果满返回true，否则返回false
    }
    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("栈满");
        }else{
            stack[++top] = item;
        }
    }
    public boolean isEmpty(){
        return top == -1;//
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("栈空");
        }else{
            return stack[top--];
        }
    }

    public static void main(String[] args) throws Exception{
        Mystack my = new Mystack(3);

        System.out.println(my.top);//当前栈的栈顶位置
        System.out.println(my.isFull());//判断当前栈是否已满
        System.out.println(my.isEmpty() + "\n");//判断栈是否为空

        my.push(11);
        System.out.println(my.top);//当前栈的栈顶位置
        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
        my.push(22);
        System.out.println(my.top);//当前栈的栈顶位置
        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
        my.push(33);
        System.out.println(my.top);//当前栈的栈顶位置
        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
//        my.push(33);
//        System.out.println(my.top);//当前栈的栈顶位置
//        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
        System.out.println(my.isEmpty() + "\n");//判断栈是否为空

        my.pop();
        System.out.println(my.top);//当前栈的栈顶位置
        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
        my.pop();
        System.out.println(my.top);//当前栈的栈顶位置
        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
        my.pop();
        System.out.println(my.top);//当前栈的栈顶位置
        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
//        my.pop();
//        System.out.println(my.top);//当前栈的栈顶位置
//        System.out.println(my.isFull() + "\n");//判断当前栈是否已满
        System.out.println(my.isEmpty() + "\n");//判断栈是否为空

    }
}
