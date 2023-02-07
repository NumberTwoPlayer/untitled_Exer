package Generic.Java2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 2023/1/31 19:47
 * @uesr 刘梹晨
 */
public class GenericTest {
    /*
    1、泛型在继承方面的体现
        类A是类B的父类，G<A>和G<B> 二者不具备子父类关系，二者是并列关系
     */
    @Test
    public void Test1(){

        List<Object> list1 = null;
        List<String> list2 = new ArrayList<String>();
        //此时的list1和list2的类型不具有子父类关系
        //编译不通过
//        list1 = list2;
        //反证法
    }
}
