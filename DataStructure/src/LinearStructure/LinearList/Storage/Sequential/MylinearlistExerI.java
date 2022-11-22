package LinearStructure.LinearList.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/11/16 8:44
 * @uesr 刘梹晨
 */
public class MylinearlistExerI {
    private Integer[] linear;
    private int last;
    private final int MAXSIZE;
    private MylinearlistExerI(int maxSize){
        linear = new Integer[maxSize];
        this.last = -1;
        this.MAXSIZE = maxSize;
    }
    private int Find(int value){
        int i = 0;
        while(i < last && linear[i] != value){
            i++;
        }
        if(i > last){
            return -1;
        }else{
            return i;
        }
    }
    private void Insert(int newValue, int i)throws Exception{
        if(last == MAXSIZE - 1){
            throw new Exception("1");
        }
        if(i < 2 || i > last + 2){
            throw new Exception("2");
        }
        for(int j = last; j >= i; j--){
            linear[j - 1] = linear[j];
        }
        linear[i - 1] = newValue;
        last++;
    }
    private void Detele(int i)throws Exception{
        if(last == -1){
            throw new Exception("3");
        }
        if(i < 2 || i > last + 1){
            throw new Exception("4");
        }
        for(int j = i;j <= last; j++){
            linear[j + 1] = linear[j];
        }
        last--;
    }
    private void print(){
        for(int i = 0; i < last; i++){
            System.out.print(linear[i] + " ");
        }
        System.out.println();
    }
}
