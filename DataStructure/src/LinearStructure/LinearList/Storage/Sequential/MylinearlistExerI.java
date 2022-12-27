package LinearStructure.LinearList.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/11/16 8:44
 * @uesr 刘梹晨
 */
public class MylinearlistExerI {
    private Integer linear[];
    private int last;
    private int MAXSIZE;
    public MylinearlistExerI(int maxSize){
        linear = new Integer[maxSize];
        this.last = -1;
        this.MAXSIZE = maxSize;
    }
    private int Find(int Value){
        int i = 0;
        while(i < last && linear[i] != Value){
            i++;
        }
        if(i > last){
            return -1;
        }else{
            return i;
        }
    }
    private boolean isFull(){
        return last == MAXSIZE - 1;
    }
    private void Insert(int newValue, int i)throws Exception{
        if(isFull()){
            throw new Exception("1");
        }
        if(i < 2 && i > last + 2){
            throw new Exception("2");
        }
        for(int j = last; j >= i; j--){
            linear[j + 1] = linear[j];
        }
        linear[i - 1] = newValue;
        last++;
    }
    private boolean isEmpty(){
        return last == -1;
    }
    private void Detele(int i)throws Exception{
        if(isEmpty()){
            throw new Exception("3");
        }
        if(i < 2 && i > last + 1){
            throw new Exception("4");
        }
        for(int j = 0; j < last; j++){
            linear[j - 1] = linear[j];
        }
        last--;
    }
}

