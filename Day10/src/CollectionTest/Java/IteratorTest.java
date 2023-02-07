package CollectionTest.Java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @version 2023/1/27 13:51
 * @uesr 刘梹晨
 *
 * 集合元素的遍历操作，使用迭代器Iterator接口
 * 1.内部的方法：hasNext()和 next()
 * 2.集合对象每次调用iterator()方法都得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前。
 * 3.内部定义了remove(),可以在遍历的时候，删除集合中的元素。此方法不同于集合直接调用remove()
 *
 */
public class IteratorTest {
    @Test
    public void Test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("zhao"));
        coll.add(new Person("Chen", 20));
        coll.add(false);

        //遍历
        Iterator iter = coll.iterator();

//        //方式一：
//        System.out.println(iter.next());
//        System.out.println(iter.next());
//        System.out.println(iter.next());
//        System.out.println(iter.next());
//        System.out.println(iter.next());
//        //异常：NoSuchElementException
//        System.out.println(iter.next());

        //方式二：不推荐
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iter.next());
//        }

        //方式三：推荐
        //hasNext():判断是否还有下一个元素
        while(iter.hasNext()){
            //next():1.指针下移 2.将下移以后集合位置上的元素返回
            System.out.println(iter.next());
        }
    }
    @Test
    public void Test2(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("zhao"));
        coll.add(new Person("Chen", 20));
        coll.add(false);

        //错误方式一：
//        Iterator iterator = coll.iterator();
//        while(iterator.next() != null){
//            System.out.println(iterator.next());
//        }

        //错误方式二：
        //集合对象每次调用iterator()方法都得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前。
        while(coll.iterator().hasNext()){
            System.out.println(coll.iterator().next());
        }
    }

    //测试remove()方法
    @Test
    public void Test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("zhao"));
        coll.add(new Person("Chen", 20));
        coll.add(false);

        //删除zhao
        //如果还未调用next()或在上一次调用 next 方法之后已经调用了 remove 方法，
        // 再调用remove都会报IllegalStateException。
        Iterator iter = coll.iterator();
        while(iter.hasNext()){
            Object obj = iter.next();
            if("zhao".equals(obj)){
                iter.remove();
            }
        }

        //遍历集合
        iter = coll.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
