package two_sum;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//
//        Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].
//
//        Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//
//        Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a;
        int b;

        for (int i = 0; i < nums.length; i++) {
            a = nums[i];
            b = target - a;
            int indexOfB = findIndex(nums, b, i + 1);

            if (indexOfB >= 0) {
                a = findIndex(nums, a, 0);
                b = indexOfB;

                return new int[]{a, b};
            }
        }

        return null;
    }

    private int findIndex(int[] ints, int target, int start) {
        for (int i = start; i < ints.length; i++) {
            if (ints[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
