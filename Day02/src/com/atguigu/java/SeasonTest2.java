package com.atguigu.java;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/11/23 8:16
 * @uesr 刘梹晨
 */
public class SeasonTest2 {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
    }
    //自定义枚举类
    static class Season {
        //1.声明Season对象的属性:private final修饰
        private final String seasonName;
        private final String seasonDesc;

        //2.私有化类的构造器,并给对象属性赋值
        private Season(String seasonName, String seasonDesc) {
            this.seasonName = seasonName;
            this.seasonDesc = seasonDesc;
        }

        //3.提供当前枚举类的多个对象
        public static final Season SPRING = new Season("春天", "万物复苏");
        public static final Season SUMMER = new Season("夏天", "烈日炎炎");
        public static final Season AUTUMN = new Season("秋天", "金秋送爽");
        public static final Season WINTER = new Season("冬天", "白雪皑皑");

        //4.其他诉求：获取枚举类对象的属性
        public String getSeasonName() {
            return seasonName;
        }

        public String getSeasonDesc() {
            return seasonDesc;
        }

        //4.其他诉求1：提供toString()
        @Override
        public String toString() {
            return "Season{" +
                    "seasonName='" + seasonName + '\'' +
                    ", seasonDesc='" + seasonDesc + '\'' +
                    '}';
        }
    }
}
