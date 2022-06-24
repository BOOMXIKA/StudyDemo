package com.boomxika.helloworld.algorithm.recursion;

/**
 * 斐波那契数列
 */
public class Fibonacci {
    public int fibonacci(int num) {
        if (num == 1 || num == 2)
            return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
