package LinearStructure.LinearList.Storage.Linked;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/22 15:55
 * @uesr 刘梹晨
 */

/**
 * 线性表链式存储常用操作集实现
 *
 * @author lck100
 */
public class MyLinearList2 {
    public class Node {
        private Object data;
        private Node next;

        public Node(){
            super();
        }
        public Node(Object data,Node next){
            super();
            this.data=data;
            this.next=next;
        }
        public Node(Object data){
            super();
            this.data=data;
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

    private Node source = new Node();
    private int size = 0;// 计数器，统计链表中结点的个数

    private MyLinearList2() {
        super();
    }

    /**
     * 获取表长
     *
     * @return 返回链表长度
     */
    private int length() {
        return size;
    }

    /**
     * 按序号查找值
     *
     * @param i 查找的序号
     * @return 如果查找成功返回该结点，否则返回null
     */
    private Node findKth(int i) {
        Node node = source;
        // 计数器，统计当前是第几个结点
        int j = 1;
        // 循环的条件是结点不能为null并且j必须小于i
        while (node != null && j < i) {
            node = node.getNext();
            j++;
        }
        // 判断计数器的值是否等于要查询的位序，如果是返回结点否则返回null
        if (j == i) {
            return node;
        } else {
            return null;
        }
    }

    /**
     * 按值查找
     *
     * @param obj 要查找的值
     * @return 如果查找成功返回该值所在结点
     */
    private Node find(Object obj) {
        Node node = source;
        // 循环判断结点的值是否与要查询的值相等，相等则返回当前结点
        while (node != null && node.getData() != obj) {
            node = node.getNext();
        }
        return node;
    }

    /**
     * 在指定位置插入
     *
     * @param i    要插入的位序
     * @param data 要插入的数据
     * @return 返回插入成功的链表
     * @throws Exception 抛出异常
     */
    private Node insert(int i, Object data) throws Exception {
        // p指的是要插入的位置之前的结点，s指的是要新插入的结点
        Node p, s;
        // 如果新结点要插在表头
        if (i == 1) {
            // 申请新结点
            s = new Node();
            // 设置新结点的数据
            s.setData(data);
            // 处理第一个结点问题
            if (size == 0) {
                // 设置新节点的指针（下一个结点）的位置
                s.setNext(null);
            } else {
                // 设置新节点的指针（下一个结点）的位置
                s.setNext(source);
            }
            source = s;
            size++;
            return s;
        }
        // 查找第(i-1)个结点，即查找要插入的位置的前一个结点
        p = findKth(i - 1);
        // 判断查询到的结点是否为null
        if (p == null) {
            throw new Exception("参数i错误！");
        } else {
            // 申请新结点
            s = new Node();
            // 设置新结点的数据
            s.setData(data);
            // 设置新结点的指针（下一个结点的位置）为查询到的结点的指针
            s.setNext(p.getNext());
            // 将要插入位置的前一个结点的指针指向当前要添加的新结点
            p.setNext(s);
            size++;
            return source;
        }
    }

    /**
     * 删除指定位置的数据
     *
     * @param i 指定的位序
     * @return 返回删除成功的链表
     * @throws Exception 抛出异常
     */
    private Node delete(int i) throws Exception {
        // p指的是要删除的结点之前的结点，s指的是要删除的结点
        Node p, s;
        // 如果要删除第一个结点
        if (i == 1) {
            s = source;
            if (source != null) {
                // 从链表中删除，即指针指向了第一个结点的下一个结点
                size--;
                source = source.getNext();
            } else {
                return null;
            }
            return source;
        }
        // 查询要删除结点的上一个节点
        p = findKth(i - 1);
        if (p == null) {
            throw new Exception("第" + (i - 1) + "个结点不存在！");
        } else if (p.getNext() == null) {
            throw new Exception("第" + i + "个结点不存在！");
        } else {
            // 将s指向第i个结点，即获取要删除的节点（通过上一个节点的指针获取要删除的节点的位置）
            s = p.getNext();
            // 从链表中删除
            p.setNext(s.getNext());
            size--;
            return source;
        }
    }

    /**
     * 打印该链表的所有结点数据
     */
    private void print() {
        Node node = source;
        while (node != null) {
            System.out.print(node.getData() + "\t");
            node = node.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        MyLinearList2 linearList = new MyLinearList2();
        linearList.insert(1, "唐僧");
        linearList.print();
        System.out.println(linearList.length());
        linearList.insert(2, "孙悟空");
        linearList.insert(3, "猪八戒");
        linearList.print();
        System.out.println(linearList.length());
        linearList.insert(1, "沙僧");
        linearList.insert(2, "小白龙");
        linearList.print();
        linearList.delete(2);
        linearList.print();
        linearList.delete(4);
        linearList.print();
        Node node = linearList.find("孙悟空");
        System.out.println(node.getData());
        Node kth = linearList.findKth(2);
        System.out.println(kth.getData());
    }
}