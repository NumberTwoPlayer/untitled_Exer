package Algorithm.BinarySearchNorear.Exer;

import java.util.Iterator;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/10 10:29
 * @uesr 刘梹晨
 */
public class Mdin {
    public static void main(String[] args) {

    }

    //遍历集合一边是采用foreach的方式，想要SequenceList也能支持foreach需要实现Iterable接口
    public class SequenceList<T> implements Iterable {
        private T[] elements;//存储元素的数组
        private int Num;//当前线性表的长度

        //创建容量为capacity的SequenceList的对象
        public SequenceList(int capacity) {
            //构建长度为capacity的存储元素的数组,Object可以存储任意形式的数组,满足T[]反省的要求,强转为T[]
            elements = (T[]) new Object[capacity];

            Num = 0;
        }

        //设置线性表为空表
        public void clear() {
            Num = 0;
        }

        //判断线性表是否为空
        public boolean isEmpty() {
            return Num == 0;
        }

        //获取线性表中元素的个数
        public int length() {
            return Num;
        }

        //读取并返回线性表中第i元素的值
        public T get(int i) {
            if (Num == 0 && i >= Num) {
                throw new IllegalStateException("当前元素不存在");
            }
            return elements[i];
        }


        //向线性表中添加一个元素t
        public void insert(T t) {
            if (Num == elements.length) {
                resize(elements.length * 2);
            }

            elements[Num++] = t;

        }

        //在线性表的第i个元素之前插入一个值为t的数据元素
        public void insert(int i, T t) {
            //i = Num相当于在尾部添加元素t
            if (i < 0 || i > Num) {
                throw new IllegalStateException("插入的位置有误");
            }


            //插入元素,插入的元素成为第i个元素,原有的第i后的元素都向后移一位
//        //安全性检验
//        if (i == elements.length) {
//            throw new IllegalStateException("当前元素已填满");
//        }

            //数据进行扩容后,就不存在由于集合元素装满而无法再加入的情况
            if (Num == elements.length) {
                resize(elements.length * 2);
            }

            for (int index = Num; index > i; index--) {
                elements[index] = elements[index - 1];
            }

            //把t加入到i位置
            elements[i] = t;

            //元素个数加一位
            Num++;

        }

        //删除并返回线性表中第i个数据元素
        public T remove(int i) {
            //安全性检验,i = Num（相当于T.length) 时，角标越界
            if (i < 0 || i > Num - 1) {
                throw new IllegalStateException("移除的元素不存在");
            }

            //移除的元素一定要先声明,通过元素的移位后,索引将会向前一位
            T result = elements[i];

            //把i位置之后的元素向前移一位
            for (int index = i; index < Num - 1; index++) {
                elements[index] = elements[index + 1];

            }

            //元素个数减少一位
            Num--;

            if (Num > 0 && Num < elements.length / 4) {
                resize(elements.length / 2);
            }

            return result;


        }

        //返回线性表中首次出现的指定的数据元素的位序号,若不寻在,则返回-1
        public int indexOf(T t) {
            //安全性检验
            if (Num == 0) {
                throw new IllegalStateException("数组中不存在该元素！");

            }

            if (t == null) {
                throw new IllegalStateException("该元素类型不合法！");
            }

            for (int index = 0; index < Num; index++) {
                if (elements[index].equals(t)) {
                    return index;
                }
            }
            return -1;
        }

        //根据扩容需要进行元素长度扩张
        public void resize(int newSize) {
            //记录旧集合元素个数
            T[] temp = elements;

            //创建新数组
            elements = (T[]) new Object[newSize];

            //把旧集合元素复制到新集合中
            for (int i = 0; i < Num; i++) {
                elements[i] = temp[i];

            }


        }

        //将新集合的长度进行更新
        public int capacity() {
            return elements.length;
        }

        //打印当前线性表的元素
        public void printElements() {
            for (int i = 0; i < Num; i++) {
                System.out.print(elements[i] + " ");

            }
            System.out.println();
        }


        @Override
        public Iterator iterator() {
            return new SequenceIterator();
        }

        private class SequenceIterator implements Iterator {

            private int cur;


            public SequenceIterator() {
                this.cur = 0;
            }

            @Override
            public boolean hasNext() {
                return cur < Num;
            }

            @Override
            public T next() {
                return elements[cur++];
            }
        }
    }
}
