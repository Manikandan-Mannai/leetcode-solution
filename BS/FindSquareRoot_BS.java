public class FindSquareRoot_BS {
    public static void main(String[] args) {
        int target = 36;
        int ans = findSquareRoot(target);
        System.out.println(ans);  // Output: 6
    }

    public static int findSquareRoot(int target){
        int low = 1, high = target;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(mid * mid <= target){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
