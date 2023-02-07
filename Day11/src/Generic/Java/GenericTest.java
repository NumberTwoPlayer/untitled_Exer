package Generic.Java;

import org.junit.Test;

import java.util.*;

/**
 * @version 2023/1/30 21:45
 * @uesr 刘梹晨
 */
/**
 * 泛型的使用
 * 1.jdk5.0新增的特征
 *
 * 2.在集合中使用泛型：
 *  总结：
 *  ①集合接口或集合类在jdk5.0时都修改为带泛型的结构。
 *  ②在实例化集合类时，可以指明具体的泛型类型
 *  ③指明完以后，在集合类或接口中凡是定义类或接口时，内部结构（比如：方法、构造器、属性等）使用到类的泛型的位置，都指定为实例化的泛型类型。
 *    比如：add(E e)  --->实例化以后：add(Integer e)
 *  ④注意点：泛型的类型必须是类，不能是基本数据类型。需要用到基本数据类型的位置，拿包装类替换
 *  ⑤如果实例化时，没有指明泛型的类型。默认类型为java.lang.Object类型。
 *
 * 3.如何自定义泛型结构：泛型类、泛型接口；泛型方法。见 GenericTest1.java
 *
 */

public class GenericTest {
    //在集合中使用泛型之前的情况：
    @Test
    public void Test1(){
        ArrayList list = new ArrayList();
        //需求：存放
        list.add(11);
        list.add(12);
        //问题一：类型不安全
        list.add("chen");
        for(Object score : list){
            //问题二：强转时，可能出现ClaCastException
            int stuScore = (Integer)score;
            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型的情况：以Arraylist为例
    @Test
    public void Test2(){
        //泛型是一种类型，需要使用包装类，而不能使用基本数据类型
        ArrayList<Integer> list = new ArrayList<Integer>();
        //编译时，回进行类型检查，保证数据的安全
        list.add(11);
        list.add(12);
        list.add(13);
        //方式一:foreach
        for(Integer in : list){
            //避免了强转操作
            int stuScore = in;
            System.out.println(stuScore);
        }
        //方式二:迭代器
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型的情况：以HashMap为例
    @Test
    public void Test3(){
        //Map<String,Integer> map = new Hashtable<String,Integer>();
        //jdk7新特性：类型推断
        Map<String,Integer> map = new Hashtable<>();

        map.put("Chen",90);
        map.put("Zhao",90);
        map.put("Long",80);

        //泛型的嵌套
        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();

        while(iterator.hasNext()){
            Map.Entry<String, Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + "----" + value);
        }
    }

}

