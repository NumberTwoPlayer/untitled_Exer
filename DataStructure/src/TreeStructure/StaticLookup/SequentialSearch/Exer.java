package TreeStructure.StaticLookup.SequentialSearch;

import TreeStructure.StaticLookup.BinarySearch.BinarySearch;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/28 8:41
 * @uesr 刘梹晨
 */
public class Exer {
    public int[] Binary;
    public int LeftBount;
    public int RightBount;
    public int Target;
    public int Top;
    private int mid;

    public Exer(int item) {
        Binary = new int[item];
        this.LeftBount = 0;
        this.RightBount = Binary.length - 1;
        this.Target = Target;
        this.Top = -1;
        this.mid = (LeftBount + RightBount) / 2;
    }

    public boolean isFull() {
        return Top == Binary.length - 1;
    }

    public void addSequentialSearch(int iemp) throws Exception {
        if (isFull()) {
            throw new Exception("数组已满");
        } else {
            Binary[++Top] = iemp;
        }
    }

    public int BinarSearce(int[] Binary) throws Exception {
        while (LeftBount <= RightBount) {
            if (Binary[mid] == Target) {
                return mid;
            } else if (Binary[mid] > Target) {
                RightBount = mid - 1;
            } else {
                LeftBount = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        Exer sc = new Exer(10);

        System.out.println(sc.mid);
        System.out.println(sc.LeftBount);
        System.out.println(sc.RightBount);
        System.out.println(sc.isFull());
        System.out.println(sc.Target = 7);


        sc.addSequentialSearch(1);
        sc.addSequentialSearch(2);
        sc.addSequentialSearch(3);
        sc.addSequentialSearch(4);
        sc.addSequentialSearch(5);
        sc.addSequentialSearch(6);
        sc.addSequentialSearch(7);
        sc.addSequentialSearch(8);
        sc.addSequentialSearch(9);
        sc.addSequentialSearch(10);
        System.out.println(sc.isFull());

        for (int i = 0; i <= sc.Binary.length - 1; i++) {
//            if (sc.Binary[i] >= sc.Binary[++i]) {
//                throw new Exception("输入错误");
//            }else{
//                System.out.println();
//            }
            System.out.print(sc.Binary[i] + "\t");
        }
        BinarySearch ter = new BinarySearch(sc.Binary);
        System.out.println();

    }
}
