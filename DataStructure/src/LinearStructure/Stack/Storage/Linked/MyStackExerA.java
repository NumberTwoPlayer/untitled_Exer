package LinearStructure.Stack.Storage.Linked;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/24 19:36
 * @uesr 刘梹晨
 */
public class MyStackExerA {
    public class Node{
        public Object data;
        public Node Next;
        public Node(){
            super();
        }
        public Node(Object data, Node Next){
            super();
            this.data = data;
            this.Next = Next;
        }
        public Node(Object data){
            super();
            this.data = data;
        }
        public Object getData(){
            return data;
        }
        public void setData(Object data){//赋值
            this.data = data;
        }
        public Node getNext(){
            return Next;
        }
        public void setNext(Node Next){//找结点
            this.Next = Next;
        }
    }
    //栈
    public Node Head;
    //构建头结点，开辟空间
    public MyStackExerA(){
        Head = new Node();
        Head.setNext(null);
    }

    /**
     * 判断堆栈是否为空
     *
     * @return 如果空则返回true，否则返回false
     */
    public boolean isEmpty(){
        return Head.getNext() == null;
    }

    /**
     * 入栈，将元素压入栈中
     *
     * @param item 要压入的元素
     */

    //由于是链式存储，所以不存在满栈的情况
    //创建一个结点
    //为结点赋值
    //指向将当前堆栈的结点
    //将当前堆栈的下一个元素（栈顶）指向新结点

    /**
     * 删除并返回堆栈的栈顶元素
     *
     * @return 返回堆栈的栈顶元素
     * @throws Exception 报错异常
     */

    //判断栈是否为空
    //获取当前栈顶结点
    //将栈顶结点指向当前栈顶元素
    //获取栈顶元素的数据

}
