class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Maxelement(weights);
        int high = accumulation(weights);

        while (low <= high) {
            int mid = (low + high) / 2;  // Fixed operator precedence
            int numberOfDays = findDays(weights, mid);
            if (numberOfDays <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low; // least capacity needed
    }

    public static int Maxelement(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public static int accumulation(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    // checks if a given capacity can ship within 'days'
    public static int findDays(int[] weights, int capacity) {
        int day = 1, load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > capacity) {
                load = weights[i];
                day++; // fixed variable name
            } else {
                load += weights[i];
            }
        }
        return day;
    }
}
