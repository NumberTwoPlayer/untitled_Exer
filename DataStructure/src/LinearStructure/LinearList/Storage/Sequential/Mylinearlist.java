package LinearStructure.LinearList.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/20 9:16
 * @uesr 刘梹晨
 */
public class Mylinearlist {
    private Integer[] list;//顺序表的存储空间，顺序表中可以存在空的情况
    private int last;//顺序表的最后一个元素的位置
    private final int MAXSIZE;//顺序表的最大长度

    private Mylinearlist(int maxSize) {
        //初始化
        list = new Integer[maxSize];//给顺序表开辟空间
        this.last = -1;//表示线性表为空
        this.MAXSIZE = maxSize;//表示线性表的最大长度
    }
    /**
     * 查找
     * 根据给定的值X在线性表中查找指定元素，如果找到则返回其下标，否则返回-1
     *
     * @param value 要查询的指定值
     * @return 如果找到返回其在表中的位置（下标），否则返回-1
     */

    private int find(int value) {
        int i = 0;
        //在表中循环遍历指定值是否与表中某项匹配，如果匹配则得到下标i
        while (i < last && list[i] != value) {
            i++;
        }
        if (i > last) {
            //如果没有找到，返回-1
            return -1;
        } else {
            //如果找到，返回的是存储位置，下标
            return i;
        }
    }

    /**
     * 插入
     * 根据给定的位序i和值newValue插入到表中
     *
     * @param newvalue 需要插入的值
     * @param i         给定的位序（不是下标）
     * @throws Exception    抛出异常
     */
    private void insert(int newvalue, int i) throws Exception {
        //首先判断表空间是否已满
        if (last == MAXSIZE - 1) {
            throw new Exception("表满");
        }
        //判断插入位序是否合法
        if (i < 1 || i > last + 2) {
            throw new Exception("位置不合法");
        }
        //将位序i之后的元素向后移动
        for (int j = last; j >= i; j--) {
            list[j + 1] = list[j];
        }
        //将值插入到表中
        list[i - 1] = newvalue;
        //修改last，使其仍然指向最后一个位置
        last++;
    }

    /**
     * 删除
     * 根据给定的位序删除表中的元素
     *
     * @param i     给定的位序（不是下标）
     * @throws Exception    抛出异常
     */
    private void delete(int i) throws Exception {
        //判断表是否为空，如果为空就不能进行删除
        if (last == -1) {
            throw new Exception("表空");
        }
        //判断删除位序是否合法
        if (i < 1 || i > last + 1) {
            throw new Exception("不存在第" + i + "个元素");
        }
        //将要删除的元素位序之后的元素向前移动一位
        for (int j = i; j <= last; j++){
            list[j - 1] = list[j];
        }
        //将last - 1，指向最后一个元素
        last--;
    }
    /**
     * 打印线性表中的所有数据
     */
    private void print(){
        for (int i = 0; i <= last; i++) {
            System.out.print(list[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {

    }
}
