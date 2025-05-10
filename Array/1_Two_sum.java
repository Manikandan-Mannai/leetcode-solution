import java.util.*;

class Two_sum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.print(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // #1 find the compliment
            int comp = target - nums[i];

            // #2 check those compliment available on map if it is return
            if (map.containsKey(comp)) {
                return new int[] { map.get(comp), i };
            }

            // #3 add the value at last to avoid issue during duplicate numbers
            map.put(nums[i], i); // (value,index)
        }
        return new int[] {};
    }
}