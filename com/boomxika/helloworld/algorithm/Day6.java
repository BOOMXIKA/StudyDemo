package com.boomxika.helloworld.algorithm;

/**
 * 搜索插入位置
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 * 结题思路：二分法
 *
 * 示例 1:
 *
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: nums = [1,3,5,6], target = 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: nums = [1,3,5,6], target = 7
 * 输出: 4
 *
 */
public class Day6 {

    public static void main(String[] args) {
        System.out.println(3/2);
        System.out.println(5/2);
        System.out.println(1/2);
        int []nums = {1,3,5,6};
        int target = 5;
        searchInsert(nums, target);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        System.out.println(right);
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
