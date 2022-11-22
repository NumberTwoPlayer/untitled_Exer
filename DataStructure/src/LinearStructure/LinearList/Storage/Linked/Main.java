package LinearStructure.LinearList.Storage.Linked;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/31 14:55
 * @uesr 刘梹晨
 */
public class Main {
    public int rear;
    public int front;
    public int[][] arr;
    public Main(){
        this.rear = 0;
        this.front = 0;
        arr = new int[19][20];
    }
    public void lust()throws Exception{
        for(int i = rear; i < arr.length - 1; i++){
            for(int j = front; j < arr[0].length - 1; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void Long()throws Exception{
        while(rear++ > front++){
            throw new Exception();
        }
    }
    public static void main(String[] args)throws Exception {
        Main ma = new Main();
        ma.lust();
    }
}

