package com.boomxika.helloworld.algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 罗马数字包含以下七种字符:I，V，X，L，C，D和M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做II，即为两个并列的 1 。12 写做XII，即为X+II。 27 写做XXVII, 即为XX+V+II。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
 * X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
 * C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
 * 给定一个罗马数字，将其转换成整数。
 */
public class Day2 {

    private static Map<String, Integer> mapRoman;

    public static void main(String[] args) {
        initRomanNumeralsMap();
        List<String> lstRoman = List.of("III", "IV", "IX", "LVIII", "MCMXCIV");
        for (String s : lstRoman) {
            System.out.println(convert(s));
        }
    }

    /**
     * 这道题目的本质就是
     * 当左边的数<右边的数就需要做减法  反之则是加法
     *
     * 1.建立罗马数与阿拉伯数字的映射关系
     * 2.从左到右开始遍历罗马数字
     * 3.对比大小： left >= right ？ + ：-
     * 4.注意不要遗漏了最后一个数的相加
     *
     * 以下是copy解答区的：
     * 按照题目的描述，可以总结如下规则：
     *
     * 罗马数字由 I,V,X,L,C,D,M 构成；
     * 当小值在大值的左边，则减小值，如 IV=5-1=4；
     * 当小值在大值的右边，则加小值，如 VI=5+1=6；
     * 由上可知，右值永远为正，因此最后一位必然为正。
     *
     * @param roman
     * @return
     */
    private static Integer convert(String roman) {
        int sum = 0;
        char c = roman.charAt(0);
        int preNum = mapRoman.get(String.valueOf(c));
        for (int i = 1; i < roman.length(); i++) {
            int num = mapRoman.get(String.valueOf(roman.charAt(i)));
            if (preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private static void initRomanNumeralsMap() {
        mapRoman = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );
    }
}
