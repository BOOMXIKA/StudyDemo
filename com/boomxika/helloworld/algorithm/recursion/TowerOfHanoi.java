package com.boomxika.helloworld.algorithm.recursion;

/**
 * 汉诺塔问题
 * 本质：2*(n-1)+1
 */
public class TowerOfHanoi {
    public int towerOfHanoi(int num) {
        if (num == 1) {
            return 1;
        }
        return 2 * towerOfHanoi(num - 1) + 1;
    }
}
