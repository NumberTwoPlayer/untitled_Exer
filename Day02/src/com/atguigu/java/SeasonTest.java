package com.atguigu.java;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/11/22 21:10
 * @uesr 刘梹晨
 */
public class SeasonTest {
    public static void main(String[] args) {

    }
    public static class Season{
        private final String SeasonName;
        private final String SeasonDesc;
        private Season(String SeasonName, String SeasonDesc){
            this.SeasonName = SeasonName;
            this.SeasonDesc = SeasonDesc;
        }
        public final static Season SPRING = new Season("1", " 2");
    }
}
