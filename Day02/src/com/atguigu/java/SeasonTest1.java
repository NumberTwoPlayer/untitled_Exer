package com.atguigu.java;

import java.lang.*;

/**
 * @author Email 3394427855@qq.com
 * @version 2022/11/23 8:08
 * @uesr 刘梹晨
 */
public class SeasonTest1 {


    enum Season1 {

        SRPING("1", "2"),

        SUMMER("3", "4"),

        AUTUMN("5", "6"),

        WINTER("7", "8");
        private final String SeasonName;
        private final String SeasonDesc;

        private Season1(String SeasonName, String SeasonDesc) {
            this.SeasonDesc = SeasonDesc;
            this.SeasonName = SeasonName;
        }

        public String getSeasonName() {
            return SeasonName;
        }

        public String getSeasonDesc() {
            return SeasonDesc;
        }

        public String toString() {
            return "Season{" +
                    "seasonName='" + SeasonName + '\'' +
                    ", seasonDesc='" + SeasonDesc + '\'' +
                    '}';
        }
    }
}
