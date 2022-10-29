package LinearStructure.Stack.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/24 7:55
 * @uesr 刘梹晨
 */
public class MystackExerE {
     public int[] stack;
     public int Top;
     private MystackExerE(int MAXSIZE){
         stack = new int[MAXSIZE];
         this.Top = -1;
     }
     public boolean isFull(){
         return Top == stack.length - 1;
    }
    public void push(int item)throws Exception{
         if(isFull()){
             throw new Exception("1");
         }else{
             stack[++Top] = item;
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

    public static void main(String[] args) throws Exception{
        MystackExerE sc = new MystackExerE(3);
    }
}
