package Leetcode.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

/*
Leetcode 217. Contains Duplicate
Level: Easy
Memory: O(n)
Time: O(n)

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:
1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
 */

public class ContainsDuplicate {

    public static void test() {
        System.out.println("===< ContainsDuplicate >===-----------------------");
        ContainsDuplicate instance = new ContainsDuplicate();

        int[] nums1 = {1,2,3,1};
        boolean result1 = instance.containsDuplicate(nums1);
        System.out.println("[" + Arrays.stream(nums1).mapToObj(String::valueOf).collect(Collectors.joining(", ")) + "]: " + result1);

        int[] nums2 = {1,2,3,4};
        boolean result2 = instance.containsDuplicate(nums2);
        System.out.println("[" + Arrays.stream(nums2).mapToObj(String::valueOf).collect(Collectors.joining(", ")) + "]: " + result2);

        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        boolean result3 = instance.containsDuplicate(nums3);
        System.out.println("[" + Arrays.stream(nums3).mapToObj(String::valueOf).collect(Collectors.joining(", ")) + "]: " + result3);
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for (Integer num : nums) {
            if (hash.contains(num)) {
                return true;
            }
            hash.add(num);
        }
        return false;
    }

}
