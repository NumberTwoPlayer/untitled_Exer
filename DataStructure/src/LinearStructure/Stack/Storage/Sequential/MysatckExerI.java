package LinearStructure.Stack.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/11/6 8:15
 * @uesr 刘梹晨
 */
public class MysatckExerI {
    public int[] Mystack;
    public int Top;
    private MysatckExerI(int maxSize){
        Mystack = new int[maxSize];
        this.Top = -1;
    }
    public boolean isFull(){
        return Top == Mystack.length - 1;
    }
    public boolean isEmpty(){
        return Top == -1;
    }
    public void push(int item)throws Exception{
        if(isFull()){
            throw new Exception("1");
        }else{
            Mystack[++Top] = item;
        }
    }
    public int Pop()throws Exception{
        if(isEmpty()){
            throw new Exception("2");
        }else{
            return Mystack[Top--];
        }
    }
}
