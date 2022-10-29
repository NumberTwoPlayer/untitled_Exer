package LinearStructure.Stack.Storage.Linked;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/20 9:33
 * @uesr 刘梹晨
 */
public class MyStack {
    public class Node {
        private Object data;
        private Node next;

        public Node() {
            super();
        }

        public Node(Object data, Node next) {
            super();
            this.data = data;
            this.next = next;
        }

        public Node(Object data) {
            super();
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    public class Mystack {
        private Node head;//栈
        private Mystack() {
            //构建头结点，开辟空间
            head = new Node();
            head.setNext(null);
        }

        /**
         * 判断堆栈是否为空
         *
         * @return 如果空则返回true，否则返回false
         */
        public boolean isEmpty() {
            return head.getNext() == null;
        }

        /**
         * 入栈，将元素压入栈中
         *
         * @param item 要压入的元素
         */
        public void push(Object item) {
            //由于是链式存储，所以不存在满栈的情况
            //创建一个结点
            Node node = new Node();
            //为结点赋值
            node.setData(item);
            //指向将当前堆栈的结点
            node.setNext(head.getNext());
            //将当前堆栈的下一个元素（栈顶）指向新结点
            head.setNext(node);
        }

        /**
         * 删除并返回堆栈的栈顶元素
         *
         * @return 返回堆栈的栈顶元素
         * @throws Exception 报错异常
         */
        public Object pop() throws Exception {
            //判断栈是否为空
            if (isEmpty()) {
                throw new Exception("栈为空");
            } else {
                //获取当前栈顶结点
                Node topNode = head.getNext();
                //将栈顶结点指向当前栈顶元素
                head.setNext(topNode.getNext());
                //获取栈顶元素的数据
                return topNode.getData();
            }
        }
    }
}
