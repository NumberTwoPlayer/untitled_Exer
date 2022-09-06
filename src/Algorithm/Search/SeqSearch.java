package Algorithm.Search;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/9/6 18:34
 * @uesr 刘梹晨
 */
public class SeqSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int index = seqSearch(arr, 9);
        System.out.println("index = " + index);
    }
    public static int seqSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
