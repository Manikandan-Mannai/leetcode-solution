import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] nums = { 1, -1, 3, 2, -2, -8, 1, 7, 10, 23 };
        int n = nums.length;
        int ans = maxLen(nums, n);
        System.out.println(ans);
    }

    public static int maxLen(int nums[], int n) {
        // #1 hasmap to store seen elements
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int sum = 0;
        int maxi = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            // If sum is 0, subarray from index 0 to i has zero sum
            if (sum == 0) {
                maxi = i + 1;
            }
            // if sum is seen, until that elemet is another subarray
            else if (mpp.get(sum) != null) {
                maxi = Math.max(maxi, i - mpp.get(sum));
            }
            // add seen element into map
            else {
                mpp.put(sum, i);
            }
        }

        return maxi;
    }

}