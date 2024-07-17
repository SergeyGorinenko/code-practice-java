package Leetcode.Array;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
Leetcode 53. Maximum Subarray
Level: Medium
Memory: O(1)
Time: O(n)

Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

Constraints:
1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

public class MaximumSubarray {

    public static void test() {
        System.out.println("===< MaximumSubarray >===-----------------------");
        MaximumSubarray instance = new MaximumSubarray();

        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        int result1 = instance.maxSubArray(nums1);
        System.out.println("[" + Arrays.stream(nums1).mapToObj(String::valueOf).collect(Collectors.joining(", ")) + "]: " + result1);
    
        int[] nums2 = {1};
        int result2 = instance.maxSubArray(nums2);
        System.out.println("[" + Arrays.stream(nums2).mapToObj(String::valueOf).collect(Collectors.joining(", ")) + "]: " + result2);

        int[] nums3 = {5,4,-1,7,8};
        int result3 = instance.maxSubArray(nums3);
        System.out.println("[" + Arrays.stream(nums3).mapToObj(String::valueOf).collect(Collectors.joining(", ")) + "]: " + result3);
    }

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int num : nums) {
            currSum += num;
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

}
