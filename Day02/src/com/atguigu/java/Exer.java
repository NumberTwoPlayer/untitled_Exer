package com.atguigu.java;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/11/23 8:39
 * @uesr 刘梹晨
 */
public class Exer {
    public static void main(String[] args) {
        exer sc = new exer(5);
    }

}
class exer{
    public Integer[] Value;
    public int left;
    public int right;
    public exer(int newValue){
        Value = new Integer[newValue];
        this.left = 0;
        this.right = Value.length - 1;
    }
    public int Binary(int value){
        int mid = (right + left) / 2;
        while(left <= right){
            if(Value[mid] == value){
                return mid;
            }
            if(Value[mid] > value){
                right = mid--;
            }else{
                left = mid++;
            }
        }
        return -1;
    }
}
