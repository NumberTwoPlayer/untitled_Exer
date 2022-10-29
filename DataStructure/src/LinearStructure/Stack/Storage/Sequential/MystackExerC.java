package LinearStructure.Stack.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/22 14:23
 * @uesr 刘梹晨
 */
public class MystackExerC {
    public int[] stack;
    public int A;
    private MystackExerC(int mexSize){
        stack = new int[mexSize];
        this.A = -1;
    }
    public boolean isNull(){
       return A == stack.length - 1;
    }
    public void push(int isem) throws Exception{
        if(isNull()){
            throw new Exception("1");
        }else{
            stack[++A] = isem;
        }
    }
    public boolean isEmpty(){
        return A == -1;
    }
    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("2");
        }else{
            return stack[A--];
        }
    }
}
