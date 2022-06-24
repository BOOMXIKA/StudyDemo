package com.boomxika.helloworld.algorithm.recursion;

/**
 * 阶乘
 */
public class Factorial {
    public int factorial(int num) {
        if (num == 1) return num;
        return num * factorial(num - 1);
    }
}
