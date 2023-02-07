package Generic.Java;

import org.junit.Test;

/**
 * @version 2023/1/31 12:59
 * @uesr 刘梹晨
 * <p>
 * 如何自定义泛型结构：泛型类、泛型接口；泛型方法
 * <p>
 * 1、关于自定义泛型类、泛型接口
 */
public class GenericTest1 {
    @Test
    public void test() {
        //如果定义了泛型类，但实例化没有指明类的泛型，则认为此泛型类型为Object类型
        //要求：如果定义了类是带泛型的，建议在实例化时要指明类的泛型。
        OrderTest order = new OrderTest();
        order.setOrderT(123);
        order.setOrderT("ABC");

        //建议：实例化时指明类的泛型
        OrderTest<String> order1 = new OrderTest<>("orderAA", 1001, "order:AA");
        order1.setOrderT("AA:hello");
    }

    @Test
    public void test2() {
        SubOrder sub1 = new SubOrder();
        //由于子类在继承带泛型的父类时，指明了泛型类型。则实例化子类对象时，不再需要指明泛型。
        sub1.setOrderT(1122);

        SubOrder1<String> sub2 = new SubOrder1<>();
        sub2.setOrderT("order2...");
    }
}
