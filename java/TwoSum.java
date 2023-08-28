import java.util.Arrays;
import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        /*
         * https://leetcode.com/problems/two-sum/
         *
         * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
         *
         * You may assume that each input would have exactly one solution, and you may not use the same element twice.
         *
         * You can return the answer in any order.
         *
         * Example 1:
         *   Input: nums = [2,7,11,15], target = 9
         *   Output: [0,1]
         *   Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         *
         * Example 2:
         *   Input: nums = [3,2,4], target = 6
         *   Output: [1,2]
         *
         * Example 3:
         *   Input: nums = [3,3], target = 6
         *   Output: [0,1]
         *
         * Constraints:
         *   2 <= nums.length <= 104
         *   -109 <= nums[i] <= 109
         *   -109 <= target <= 109
         *   Only one valid answer exists.
         *
         * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
         */

        System.out.println(twoSum(new int[]{2, 7, 11, 15}, 9));
        System.out.println(twoSum(new int[]{3, 2, 4}, 6));
        System.out.println(twoSum(new int[]{3, 3}, 6));
    }

    public static int[] twoSum(int[] nums, int target) {
        // Brute force: using an array and keep checking different values
        // Second idea, using an array, sort it and then check against others with a second index
        // Third idea: using a hash
        HashMap<Integer, Integer> numberCounters = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (!numberCounters.containsKey(nums[i])) {
                numberCounters.put(nums[i], i);
            }

            if (numberCounters.containsKey(target - nums[i]) && numberCounters.get(target - nums[i]) != i) {
                return new int[]{numberCounters.get(target - nums[i]), i};
            }
        }
        return new int[0];
    }
}