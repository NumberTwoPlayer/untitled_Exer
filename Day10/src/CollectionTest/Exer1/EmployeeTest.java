package CollectionTest.Exer1;

/**
 * @version 2023/1/28 21:33
 * @uesr 刘梹晨
 */

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 创建该类的5 个对象，并把这些对象放入TreeSet 集合中
 * （下一章：TreeSet 需使用泛型来定义）分别按以下两种方式
 * 对集合中的元素进行排序，并遍历输出：
 *
 * 1). 使Employee 实现Comparable 接口，并按name 排序
 * 2). 创建TreeSet 时传入Comparator对象，按生日日期的先后排序。
 */

public class EmployeeTest {
    //问题二：按生日日期的先后排序
    @Test
    public void Test2(){

        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();
//                    //方式一
//                    int MinusYear = b1.getYear() - b2.getYear();
//                    if(MinusYear != 0){
//                        return MinusYear;
//                    }
//                    int MinusMonth = b1.getMouth() - b2.getMouth();
//                    if(MinusMonth != 0){
//                        return MinusMonth;
//                    }
//                    return b1.getDay() - b2.getDay();

                    //方式二
                    return b1.compareTo(b2);
                }
//                return 0;
                throw new RuntimeException("bbbbbbbbbbbb~");
            }
        });

        Employee e1 = new Employee("chen",21,new MyDate(2003,9,24));
        Employee e3 = new Employee("Number",23,new MyDate(2005,9,24));
        Employee e2 = new Employee("Two",22,new MyDate(2004,9,4));
        Employee e4 = new Employee("Player",24,new MyDate(2006,9,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
//            iterator.next().sout
            System.out.println(iterator.next());
        }
    }
    //问题一：使用自然排序
    @Test
    public void Test1(){
        TreeSet set = new TreeSet();

        Employee e1 = new Employee("chen",21,new MyDate(2003,9,24));
        Employee e2 = new Employee("Two",22,new MyDate(2004,9,4));
        Employee e3 = new Employee("Number",23,new MyDate(2005,9,24));
        Employee e4 = new Employee("Player",24,new MyDate(2006,9,4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
//            iterator.next().sout
            System.out.println(iterator.next());
        }
    }
}
