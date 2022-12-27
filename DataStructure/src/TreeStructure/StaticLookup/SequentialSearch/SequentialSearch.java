package TreeStructure.StaticLookup.SequentialSearch;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/28 8:41
 * @uesr 刘梹晨
 */
public class SequentialSearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        int index = Searching(array, 7);
        System.out.println(index);
    }


    public static int Searching(int[] area, int value) {
        for (int i : area) {
            if (area[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

