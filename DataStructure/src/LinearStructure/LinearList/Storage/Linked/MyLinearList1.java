package LinearStructure.LinearList.Storage.Linked;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/22 16:01
 * @uesr 刘梹晨
 */
public class MyLinearList1 {
    public static class Node {
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

    private MyLinearList1() {
        super();
    }

    /**
     * 获取表长
     *
     * @return 返回链表长度
     */
    private int length(Node sourceNode) {
        // node指向表的第一个结点
        Node node = sourceNode;
        // 计数器，用来统计链表结点个数，初始为0个
        int j = 0;
        // 结点为null时表示没有下一个结点了，跳出循环，返回链表长度
        while (node != null) {
            // 当前node指向第j个结点
            node = node.getNext();
            j++;
        }
        return j;
    }

    /**
     * 按序号查找值
     *
     * @param i          查找的序号
     * @param sourceNode 当前要操作的链表
     * @return 如果查找成功返回该结点，否则返回null
     */
    private Node findKth(int i, Node sourceNode) {
        Node node = sourceNode;
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
     * @param obj        要查找的值
     * @param sourceNode 要操作的链表
     * @return 如果查找成功返回该值所在结点
     */
    private Node find(Object obj, Node sourceNode) {
        Node node = sourceNode;
        // 循环判断结点的值是否与要查询的值相等，相等则返回当前结点
        while (node != null && node.getData() != obj) {
            node = node.getNext();
        }
        return node;
    }

    /**
     * 在指定位置插入
     *
     * @param i          要插入的位序
     * @param data       要插入的数据
     * @param sourceNode 要操作的链表
     * @return 返回插入成功的链表
     * @throws Exception 抛出异常
     */
    private Node insert(int i, Object data, Node sourceNode) throws Exception {
        // p指的是要插入的位置之前的结点，s指的是要新插入的结点
        Node p, s;
        // 如果新结点要插在表头
        if (i == 1) {
            // 申请新结点
            s = new Node();
            // 设置新结点的数据
            s.setData(data);
            // 设置新节点的指针（下一个结点）的位置
            s.setNext(sourceNode);
            return s;
        }
        // 查找第(i-1)个结点，即查找要插入的位置的前一个结点
        p = findKth(i - 1, sourceNode);
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
            return sourceNode;
        }
    }

    /**
     * 删除指定位置的数据
     *
     * @param i          指定的位序
     * @param sourceNode 链表
     * @return 返回删除成功的链表
     * @throws Exception 抛出异常
     */
    private Node delete(int i, Node sourceNode) throws Exception {
        // p指的是要删除的结点之前的结点，s指的是要删除的结点
        Node p, s;
        // 如果要删除第一个结点
        if (i == 1) {
            s = sourceNode;
            if (sourceNode != null) {
                // 从链表中删除，即指针指向了第一个结点的下一个结点
                sourceNode = sourceNode.getNext();
            } else {
                return null;
            }
            return sourceNode;
        }
        // 查询要删除结点的上一个节点
        p = findKth(i - 1, sourceNode);
        if (p == null) {
            throw new Exception("第" + (i - 1) + "个结点不存在！");
        } else if (p.getNext() == null) {
            throw new Exception("第" + i + "个结点不存在！");
        } else {
            // 将s指向第i个结点，即获取要删除的节点（通过上一个节点的指针获取要删除的节点的位置）
            s = p.getNext();
            // 从链表中删除
            p.setNext(s.getNext());
            return sourceNode;
        }
    }

    /**
     * 打印该链表的所有结点数据
     *
     * @param node 链表
     */
    private void print(Node node) {
        while (node != null) {
            System.out.print(node.getData() + "\t");
            node = node.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        MyLinearList1 linearList = new MyLinearList1();
        // 作头结点使用
        Node head = new Node("唐僧", null);
        // 插入一个结点，位序是1
        Node insert1 = linearList.insert(1, "孙悟空", head);
        linearList.print(insert1);
        // 插入一个结点，位序非1
        Node insert2 = linearList.insert(2, "猪八戒", insert1);
        linearList.print(insert2);
        // 打印链表的长度
        System.out.println(linearList.length(insert2));
        // 按序号查找
        Node kth = linearList.findKth(2, insert2);
        System.out.println(kth.getData());
        // 按值查找
        Node find = linearList.find("唐僧", insert2);
        System.out.println(find.getData());
        // 删除指定位序的结点，比如删除第二个结点
        Node delete = linearList.delete(2, insert2);
        linearList.print(delete);
    }
}