class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Maxelement(nums);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sumByd(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int Maxelement(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public static int sumByd(int[] nums, int d) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (int) Math.ceil((double) nums[i] / d);
        }
        return sum;
    }
}
