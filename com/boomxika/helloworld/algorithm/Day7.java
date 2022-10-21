package com.boomxika.helloworld.algorithm;

/**
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 * <p>
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "Hello World"
 * 输出：5
 * 解释：最后一个单词是“World”，长度为5。
 * 示例 2：
 * <p>
 * 输入：s = "   fly me   to   the moon  "
 * 输出：4
 * 解释：最后一个单词是“moon”，长度为4。
 * 示例 3：
 * <p>
 * 输入：s = "luffy is still joyboy"
 * 输出：6
 * 解释：最后一个单词是长度为6的“joyboy”。
 */
public class Day7 {
    public static int lengthOfLastWord(String s) {
        final var split = s.split(" ");
        final var length = split.length - 1;
        final var s1 = split[length];
        return s1.length();
    }

    public static void main(String[] args) {
        lengthOfLastWord("   fly me   to   the moon  ");
    }
}
