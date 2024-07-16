package Leetcode.Array;

/*
Leetcode 1. Two Sum
Level: Easy
Complexity: O(n)

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
• 2 < nums. length <= 10^4
• -10^9 ≤ nums[i] ≤ 10^9
• -10^9 ≤ target ≤ 10^9
• Only one valid answer exists.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class TwoSum {

    public static void test() {
        System.out.println("===< TwoSum >===-----------------------");
        TwoSum instance = new TwoSum();

        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        int[] result1 = instance.twoSum(nums1, target1);
        System.out.println("[" + Arrays.stream(nums1).mapToObj(String::valueOf).collect(Collectors.joining(", ")) + "]: " + Arrays.toString(result1));

        int[] nums2 = {3,2,4};
        int target2 = 6;
        int[] result2 = instance.twoSum(nums2, target2);
        System.out.println("[" + Arrays.stream(nums2).mapToObj(String::valueOf).collect(Collectors.joining(", ")) + "]: " + Arrays.toString(result2));

        int[] nums3 = {3,3};
        int target3 = 6;
        int[] result3 = instance.twoSum(nums3, target3);
        System.out.println("[" + Arrays.stream(nums3).mapToObj(String::valueOf).collect(Collectors.joining(", ")) + "]: " + Arrays.toString(result3));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = {0, 0};
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int num = nums[index];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                int diffValue = prevMap.get(diff);
                result[0] = diffValue;
                result[1] = index;
                break;
            }

            prevMap.put(num, index);
        }
        Arrays.sort(result);

        return result;
    }

}
