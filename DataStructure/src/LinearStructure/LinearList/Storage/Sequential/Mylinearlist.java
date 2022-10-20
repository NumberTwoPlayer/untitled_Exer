package LinearStructure.LinearList.Storage.Sequential;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/20 9:16
 * @uesr 刘梹晨
 */
public class Mylinearlist {
    private Integer[] list;
    private int last;
    private final int MAXSIZE;

    private Mylinearlist(int maxSize) {
        list = new Integer[maxSize];
        this.last = -1;
        this.MAXSIZE = maxSize;
    }

    private int find(int value) {
        int i = 0;
        while (i < last && list[i] != value) {
            i++;
        }
        if (i > last) {
            return -1;
        } else {
            return i;
        }
    }

    private void insert(int newvalue, int i) throws Exception {
        if (last == MAXSIZE - 1) {
            throw new Exception("表满");
        }
        if (i < 1 || i > last + 2) {
            throw new Exception("位置不合法");
        }
        for (int j = last; j >= i; j--) {
            list[j + 1] = list[j];
        }
    }

    private void delete(int i) throws Exception {
        if (last == -1) {
            throw new Exception("表空");
        }
        if (i < 1 || i > last + 1) {
            throw new Exception("不存在第" + i + "个元素");
        }
        for (int j = i; j <= last; j++){
            list[j - 1] = list[j];
        }
        last--;
    }
}
