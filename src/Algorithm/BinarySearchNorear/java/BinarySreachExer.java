package Algorithm.BinarySearchNorear.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/9/6 17:34
 * @uesr 刘梹晨
 */
public class BinarySreachExer {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 7, 7, 9};
        List<Integer> reaIndexList = binarySearch(arr, 0, arr.length - 1, 7);
        System.out.println("resIndexList = " + reaIndexList);
    }

    static ArrayList<Integer> binarySearch(int[] arr, int left, int right, int findVal) {
        if (left > right) {
            return new ArrayList<>();
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        if (findVal > midVal) {
            return binarySearch(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return binarySearch(arr, left, mid - 1, findVal);
        } else {
            /*
            思路分析
//            1、在找到mid索引值，不要马上返回
//            2、向mid索引值的左边扫描，将所有满足的数据的元素下标，加入到集合ArrayList
//            3、向mid索引值的右边扫描，将所有满足的数据的元素下标，加入到集合ArrayList
//            4、将ArrayList返回
             */
            ArrayList<Integer> resIndexlist = new ArrayList<>();
            //向mid索引值的左边扫描，将所有满足的数据的元素下标，加入到集合ArrayList
            int temp = mid - 1;
            while (true) {
                if (temp < 0 || arr[temp] != findVal) {//退出
                    break;
                }
                //否则，就temp放入到resIndexlist
                resIndexlist.add(temp);
                temp -= 1;//temp左移
            }
            resIndexlist.add(mid);
            temp = mid + 1;
            while (true) {
                if (temp > arr.length - 1 || arr[temp] != findVal) {//退出
                    break;
                }
                //否则，就temp放入到resIndexlist
                resIndexlist.add(temp);
                temp += 1;//temp右移
            }

            return resIndexlist;
        }
    }
}
