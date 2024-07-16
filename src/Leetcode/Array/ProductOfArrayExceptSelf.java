package Leetcode.Array;

/*
Leetcode 238. Product of Array Except Self
Level: Medium
Memory: O(1)
Time: O(n)

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Constraints:
2 <= nums.length <= 10^5
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 */

import java.util.Arrays;
import java.util.stream.Collectors;

public class ProductOfArrayExceptSelf {

    public static void test() {
        System.out.println("===< ProductOfArrayExceptSelf >===-----------------------");
        ProductOfArrayExceptSelf instance = new ProductOfArrayExceptSelf();

        int[] nums1 = {1,2,3,4};
        int[] result1 = instance.productExceptSelf(nums1);
        System.out.println("[" + Arrays.stream(nums1).mapToObj(String::valueOf).collect(Collectors.joining(", ")) + "]: " + Arrays.toString(result1));

        int[] nums2 = {-1,1,0,-3,3};
        int[] result2 = instance.productExceptSelf(nums2);
        System.out.println("[" + Arrays.stream(nums2).mapToObj(String::valueOf).collect(Collectors.joining(", ")) + "]: " + Arrays.toString(result2));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] resultNums = new int[nums.length];
        Arrays.fill(resultNums, 1); 
        
        int product = 1;
        for (int index = 0; index < (nums.length - 1); index++) {
            product = product * nums[index];
            resultNums[index + 1] = product;
        }

        product = 1;
        for (int index = (nums.length - 1); index > 0; index--) {
            product = product * nums[index];
            resultNums[index - 1] *= product;
        }

        return resultNums;
    }

    public static void main(String[] args) {
         ProductOfArrayExceptSelf.test();
    }

}
