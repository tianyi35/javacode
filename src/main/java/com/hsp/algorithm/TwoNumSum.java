package com.hsp.algorithm;

import java.util.HashMap;

/**
 * Description: 两次之和
 * Author: Lixp
 * Date: 2023-04-19 14:42
 * Version 1.0
 */
public class TwoNumSum {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
       // int[] nums1 = new int[]{12,123,123,123,123,123};
        int target = 6;
        //System.out.println(twoSum1(nums, target));

        System.out.println(twoSum2(nums, target));

    }


    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出
     * 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
     * <p>
     * 分析
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     *
     * @param nums
     * @param target
     * @return
     *
     *
     * 方法一：暴力枚举
     * 思路及算法
     *
     * 最容易想到的方法是枚举数组中的每一个数 x，寻找数组中是否存在 target - x。
     *
     * 当我们使用遍历整个数组的方式寻找 target - x 时，需要注意到每一个位于 x 之前的元素都已经和 x 匹配过，
     * 因此不需要再进行匹配。而每一个元素不能被使用两次，所以我们只需要在 x 后面的元素中寻找 target - x。
     */
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
    /**
     *
     * 复杂度分析
     *
     * 时间复杂度：O(N^2))，其中 N 是数组中的元素数量。最坏情况下数组中任意两个数都要被匹配一次。
     * 空间复杂度：O(1)。
     * 方法二：哈希表
     * 思路及算法
     *
     * 注意到方法一的时间复杂度较高的原因是寻找 target - x 的时间复杂度过高。因此，我们需要一种更优秀的方法，
     * 能够快速寻找数组中是否存在目标元素。如果存在，我们需要找出它的索引。
     *
     * 使用哈希表，可以将寻找 target - x 的时间复杂度降低到从 O(N) 降低到 O(1)。
     *
     * 这样我们创建一个哈希表，对于每一个 x，我们首先查询哈希表中是否存在 target - x，然后将 x 插入到哈希表中，
     * 即可保证不会让 x 和自己匹配
     */
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> hashTable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashTable.containsKey(target - nums[i])) {
                return new int[]{hashTable.get(target - nums[i]), i};
            }
            hashTable.put(nums[i], i);
        }
        return new int[0];
    }
}
