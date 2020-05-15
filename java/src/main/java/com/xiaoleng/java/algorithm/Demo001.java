package com.xiaoleng.java.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author chen jia
 * @date 2020/5/15 11:33
 */
public class Demo001 {

    /**
     * 找出数组中重复的数字。
     * <p>
     * <p>
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     * <p>
     * 示例 1：
     * <p>
     * 输入：
     * [2, 3, 1, 0, 2, 5, 3]
     * 输出：2 或 3
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
     */


    public static void main(String[] args) throws IOException {

        //生成数组
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("请输入数组个数:");
        String s = bufferedReader.readLine();
        int n = 0;
        while (true) {
            try {
                n = Integer.parseInt(s);
                if (n < 1) {
                    System.out.println("输入参数非法,请重新输入");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入参数非法,请重新输入");
            }
        }
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            Integer param = Integer.parseInt(bufferedReader.readLine());
            nums[i] = param;
        }





    }
}
