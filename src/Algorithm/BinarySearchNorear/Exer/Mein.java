package Algorithm.BinarySearchNorear.Exer;
/**
 * @author Email 3394427855@qq.com
 * @version 2022/10/10 11:03
 * @uesr 刘梹晨
 */
public class Mein {
    public static void main(String[] args) {
        Season sc = Season.ExerSon;
        System.out.println(sc);//可重写
    }

}
enum Season {
    ExerSon("凌晨","极静"),
    FutureSon("极夜","安静"),
    ExerSea("子夜","冷静"),
    FutureSea("午夜","寒静");

    private final String SeasonName;
    private final String SeasonExer;

    private Season(String SeasonName, String SeasonExer) {
        this.SeasonName = SeasonName;
        this.SeasonExer = SeasonExer;
    }

    public String getSeasonName(){
        return SeasonName;
    }
    public String getSeasonExer(){
        return SeasonExer;
    }

}
