package two_sum;

import java.util.HashMap;
import java.util.Map;

public class SolutionTree implements Solution {
    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int a : nums) {
            int b = target - a;

            if (map.containsKey(b)) {
                return new int[]{map.get(a), map.get(b)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
