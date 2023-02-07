package Generic.Java;

/**
 * @version 2023/1/31 12:53
 * @uesr 刘梹晨
 */

/**
 * 自定义泛型类
 */
public class OrderTest<T> {
    String orderName;
    int orderId;
    //类的内部结构就可以使用类的泛型
    T orderT;

    public OrderTest() {
    }
    public OrderTest(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    //如下的三个方法都不是泛型方法
    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }
}
