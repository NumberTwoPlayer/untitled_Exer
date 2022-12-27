package Sort.QuickSort;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/9/5 23:54
 * @uesr 刘梹晨
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        Sort(arr, 0, arr.length - 1);
        print(arr);
    }
    static void Sort(int[] arr, int leftBount, int rightBount){
        if(leftBount >= rightBount) return;
        int mid = QuickSort(arr, leftBount, rightBount);
        Sort(arr, leftBount, mid - 1);
        Sort(arr,mid + 1, rightBount);
    }
    static int QuickSort(int[] arr, int leftBount, int rightBount){
        int left = leftBount;
        int right = rightBount - 1;
        int pivot = arr[rightBount];
        while(left <= right){
            while(left <= right && arr[left] <= pivot) left++;
            while(left <= right && arr[right] >= pivot) right--;
            if(left <= right) swap(arr, left, right);
            System.out.println(" left --> " + left + " right --> " + right );
        }
        System.out.print("--");
        print(arr);
        System.out.println();
        swap(arr, left, rightBount);
        return left;
    }

    static void swap(int[] arr, int i ,int j){
        int test = arr[i];
        arr[i] = arr[j];
        arr[j] = test;
    }
    static void print(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
