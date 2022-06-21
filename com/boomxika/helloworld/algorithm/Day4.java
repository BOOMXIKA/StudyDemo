package com.boomxika.helloworld.algorithm;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * <p>
 * 示例 1：
 * 输入：s = "()"
 * 输出：true
 * <p>
 * 示例2：
 * 输入：s = "()[]{}"
 * 输出：true
 * <p>
 * 示例3：
 * 输入：s = "(]"
 * 输出：false
 */
public class Day4 {
    public static void main(String[] args) {
        System.out.println(isValid("[]{}("));
    }

    private static final Map<Character, Character> map = new HashMap<Character, Character>() {{
        put('{', '}');
        put('[', ']');
        put('(', ')');
        put('?', '?');
    }};

    /**
     * 个人解题思路：
     * 可用堆栈也可以用队列
     * 要是当前字符是左括号的话，就入栈；
     * 如果不是左括号的话，就根据map映射判断是否正确对应，如果不对应就直接返回false了，对应的话就remove；最后队列size=0就是有效的括号对应字符串
     */
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;
        LinkedList<Character> stack = new LinkedList<>() {{
            add('?');
        }};
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.add(c);
            } else if (!map.get(stack.removeLast()).equals(c)) {
                return false;
            }
        }
        return stack.size() == 1;
    }
}
