package com.boomxika.helloworld.algorithm;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串""。
 *
 * 示例 1：
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 *
 * 示例 2：
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 */
public class Day3 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    /**
     * 没有什么骚的想法 直接对比了
     * <p>
     * 因为是最长公共前缀，所以直接先相邻比较就好了，然后拿到1，2的公共前缀；然后再用这个公共前缀跟第3个对比，以此类推
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String temp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < temp.length() && j < strs[i].length(); j++) {
                if (temp.charAt(j) != strs[i].charAt(j))
                    break;
            }
            temp = temp.substring(0, j);
            if (temp.equals(""))
                return temp;
        }
        return temp;
    }
}
