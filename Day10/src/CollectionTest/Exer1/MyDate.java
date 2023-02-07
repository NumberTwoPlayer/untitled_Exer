package CollectionTest.Exer1;

/**
 * @version 2023/1/28 21:27
 * @uesr 刘梹晨
 */
/**
 * MyDate类包含:
 * private成员变量year,month,day；并为每一个属性定义getter,  setter 方法；
 */
public class MyDate implements Comparable {
    private int year;
    private int mouth;
    private int day;

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", mouth=" + mouth +
                ", day=" + day +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    public MyDate() {
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof MyDate) {
            MyDate m = (MyDate) o;
            int MinusYear = this.getYear() - m.getYear();
            if (MinusYear != 0) {
                return MinusYear;
            }
            int MinusMonth = this.getMouth() - m.getMouth();
            if (MinusMonth != 0) {
                return MinusMonth;
            }
            return this.getDay() - m.getDay();
        }
        throw new RuntimeException("bbbbbbbbbbbb~");
    }
}
