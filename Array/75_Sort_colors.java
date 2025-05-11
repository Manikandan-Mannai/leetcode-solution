class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int n = nums.length;

        // #1 find count of 0s, 1s, 2s
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        // #2 replace 0s, from 0 <-> count0
        for (int i = 0; i < count0; i++) {
            nums[i] = 0;
        }

        // #3 replace 1s, from count0 <-> count0+count1
        for (int i = count0; i < count0 + count1; i++) {
            nums[i] = 1;
        }

        // #3 replace 1s, from count0 <-> count0+count1
        for (int i = count0 + count1; i < n; i++) {
            nums[i] = 2;
        }
    }
}