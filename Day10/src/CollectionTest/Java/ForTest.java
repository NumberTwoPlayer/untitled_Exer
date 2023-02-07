package CollectionTest.Java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @version 2023/1/27 14:21
 * @uesr 刘梹晨
 */
public class ForTest {
    @Test
    public void Test1() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("zhao"));
        coll.add(new Person("Chen", 20));
        coll.add(false);

        //for(集合对象的类型 局部变量 ： 集合对象)
        //内部仍然调用了迭代器
        for (Object obj : coll) {
            System.out.println(obj);
        }
    }

    @Test
    public void Test2() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        for(int i : arr){
            System.out.println(i);
        }
    }

    //练习题
    @Test
    public void test3(){
        String[] arr = new String[]{"SS","KK","RR"};

//        //方式一：普通for赋值
//        for(int i = 0;i < arr.length;i++){
//            arr[i] = "HH";
//        }

        //方式二：增强for循环
        for(String s : arr){
            s = "HH";
        }

        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
