package LinearStructure.Stack.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/23 8:36
 * @uesr 刘梹晨
 */
public class MystackExerD {
    public int[] stack;
    public int Top;
    private MystackExerD(int MAX){
        stack = new int[MAX];
        this.Top = -1;
    }
    public boolean isFull(){
        return Top == stack.length - 1;
    }
    public void push(int empty) throws Exception{
        if(isFull()){
            throw new Exception("1");
        }else{
            stack[++Top] = empty;
        }
    }
    public boolean isEmpty(){
        return Top == -1;
    }
    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("2");
        }else{
           return stack[Top--];
        }
    }
}
