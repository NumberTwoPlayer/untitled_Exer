package TreeStructure.DynamicLookup.BinaryTree.NorRecursion;

import java.util.Arrays;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/12/27 12:13
 * @uesr 刘梹晨
 */
public class Soted {
    public static void Sort(int[] arr, int leftBount, int rightBount) {
        if (leftBount >= rightBount) return;
        int mid = QuickSort(arr, leftBount, rightBount);
        Sort(arr, leftBount, mid - 1);
        Sort(arr, mid + 1, rightBount);
    }

    public static int QuickSort(int[] arr, int leftBount, int rightBount) {
        int left = leftBount;
        int right = rightBount - 1;
        int pivot = arr[rightBount];
        while (left <= right) {
            while (left <= right && arr[left] <= pivot) left++;
            while (left <= right && arr[right] >= pivot) right--;
            if (left <= right) swap(arr, left, right);

        }
        swap(arr, left, rightBount);
        return left;
    }

    public static void swap(int[] arr, int i, int j) {
        int test = arr[i];
        arr[i] = arr[j];
        arr[j] = test;
    }

    public static void rightSort(int[] arr){
        Arrays.sort(arr);
    }

    public static int[] generateRandomArray(int maxSize, int MaxNum) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (MaxNum + 1)) - (int) (Math.random() * MaxNum);
        }
        return arr;
    }

    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    public static boolean isEquals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        if (arr1 != null && arr2 == null || arr1 == null && arr2 != null) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        return true;
    }

    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int testTims = 100000;
        int maxSize = 1000;
        int maxNum = 1000;
        boolean euqals = true;
        for (int i = 0; i < testTims; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxNum);
            int[] arr2 = copyArray(arr1);
            Sort(arr1, 0, arr1.length - 1);
            rightSort(arr2);
            if(!isEquals(arr1, arr2)){
                euqals = false;
                break;
            }
        }
        System.out.println(euqals  ? "数据正确" : "Error");
        int[] newArr = generateRandomArray(maxSize,maxNum);
        printArray(newArr);
        Sort(newArr, 0, newArr.length - 1);
        printArray(newArr);
    }

}


