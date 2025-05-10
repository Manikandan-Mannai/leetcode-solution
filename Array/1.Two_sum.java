package Array;

import java.util.Arrays;

class Two_sum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;
        Arrays.sort(nums);
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
}