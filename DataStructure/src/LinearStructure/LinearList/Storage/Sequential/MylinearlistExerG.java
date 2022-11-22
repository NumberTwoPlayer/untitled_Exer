package LinearStructure.LinearList.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/11/10 14:33
 * @uesr 刘梹晨
 */
public class MylinearlistExerG {
    private Integer[] Linear;
    private int last;
    private final int MAXSIZE;
    private MylinearlistExerG(int maxSize){
        Linear = new Integer[maxSize];
        this.last = -1;
        this.MAXSIZE = maxSize;
    }
    private int Find(int value){
        int i = 0;
        while(i < last && Linear[i] != value){
            i++;
        }
        if(i > last){
            return -1;
        }else{
            return i;
        }
    }
    private void Insert(int newValue, int i) throws Exception{
        if(last == MAXSIZE -1){
            throw new Exception("1");
        }
        if(i < 2 || i  > last + 2){
            throw new Exception("2");
        }
        for(int j = last; j >= i; j--){
            Linear[j + 1] = Linear[j];
        }
        Linear[i - 1] = newValue;
        last++;
    }
    private void Detele(int i)throws Exception{
        if(last == -1){
            throw new Exception("3");
        }
        if(i < 2 || i > last + 1){
            throw new Exception("4");
        }
        for(int j = i; j < last; j++){
            Linear[j - 1] = Linear[j];
        }
        last--;
    }
    private void print(){
        for(int i = 0; i < last; i++){
            System.out.println(Linear[i] + " ");
        }
        System.out.println();
    }
}
